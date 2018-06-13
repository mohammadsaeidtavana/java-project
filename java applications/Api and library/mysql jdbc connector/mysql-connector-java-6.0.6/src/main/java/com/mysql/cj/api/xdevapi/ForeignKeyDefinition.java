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

package com.mysql.cj.api.xdevapi;

/**
 * FkSpec
 * ::= 'new ForeignKeyDef()'
 * '.fields(' StringLiteral (',' StringLiteral)* ')'
 * '.refersTo(' StringLiteral (',' StringLiteral)+ ')' // table and columns
 * ( '.onDelete(' ('Restrict' | 'Cascade' | 'SetNull') ')' )?
 * ( '.onUpdate(' ('Restrict' | 'Cascade' | 'SetNull') ')' )?
 */
public interface ForeignKeyDefinition {

    public enum ChangeMode {
        RESTRICT, CASCADE, SET_NULL, NO_ACTION;

        public String getExpr() {
            switch (this) {
                case SET_NULL:
                    return "SET NULL";
                case NO_ACTION:
                    return "NO ACTION";
                default:
                    return this.name();
            }
        }
    };

    ForeignKeyDefinition setName(String fkName);

    ForeignKeyDefinition fields(String... column);

    ForeignKeyDefinition refersTo(String table, String... column);

    ForeignKeyDefinition onDelete(ChangeMode mode);

    ForeignKeyDefinition onUpdate(ChangeMode mode);
}
