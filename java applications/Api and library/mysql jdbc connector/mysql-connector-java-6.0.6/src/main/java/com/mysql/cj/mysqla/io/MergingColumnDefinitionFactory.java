/*
  Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.

  The MySQL Connector/J is licensed under the terms of the GPLv2
  <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>, like most MySQL Connectors.
  There are special exceptions to the terms and conditions of the GPLv2 as it is applied to
  this software, see the FOSS License Exception
  <http://www.mysql.com/about/legal/licensing/foss-exception.html>.

  This program is free software; you can redistribute it and/or modify it under the terms
  of the GNU General Public License as published by the Free Software Foundation; version 2
  of the License.

  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
  See the GNU General Public License for more details.

  You should have received a copy of the GNU General Public License along with this
  program; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth
  Floor, Boston, MA 02110-1301  USA

 */

package com.mysql.cj.mysqla.io;

import com.mysql.cj.api.mysqla.io.ProtocolEntityFactory;
import com.mysql.cj.api.mysqla.result.ColumnDefinition;
import com.mysql.cj.core.exceptions.ExceptionFactory;
import com.mysql.cj.core.exceptions.WrongArgumentException;
import com.mysql.cj.core.result.Field;
import com.mysql.cj.mysqla.result.MysqlaColumnDefinition;

// We need to merge metadata from COM_STMT_PREPARE and COM_STMT_EXECUTE:
// 1. some field flags do exist in metadata returned by COM_STMT_PREPARE but are missed after COM_STMT_EXECUTE
// 2. COM_STMT_EXECUTE returns metadata with actual field data types, they may mismatch those from COM_STMT_PREPARE
public class MergingColumnDefinitionFactory extends ColumnDefinitionFactory implements ProtocolEntityFactory<ColumnDefinition> {

    public MergingColumnDefinitionFactory(long columnCount, ColumnDefinition columnDefinitionFromCache) {
        super(columnCount, columnDefinitionFromCache);
    }

    @Override
    public boolean mergeColumnDefinitions() {
        return true;
    }

    @Override
    public ColumnDefinition createFromFields(Field[] fields) {
        if (this.columnDefinitionFromCache != null) {
            if (fields.length != this.columnCount) {
                throw ExceptionFactory.createException(WrongArgumentException.class, "Wrong number of ColumnDefinition fields.");
            }
            Field[] f = this.columnDefinitionFromCache.getFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setFlags(f[i].getFlags());
            }
        }
        return new MysqlaColumnDefinition(fields);
    }
}
