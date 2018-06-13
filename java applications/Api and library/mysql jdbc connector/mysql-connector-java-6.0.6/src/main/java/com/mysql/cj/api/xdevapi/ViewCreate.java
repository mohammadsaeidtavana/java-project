/*
  Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.

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
 * Handles the creation of a View.
 * <p>
 * View creation is only allowed if the {@link #definedAs(String)} or {@link #definedAs(SelectStatement)} function was called.
 * <p>
 * Example:
 * 
 * <pre>
 * // Creates the view through the Schema object
 * Schema schema = session.getSchema('sakila');
 * Table table = db.getTable("actor");
 * Table view = db.createView("actor_list")
 *              .definedAs(table.select("concat(first_name, \" \", last_name) as name, age").orderBy("name ASC"))
 *              .execute();
 * 
 * // Retrieves the view through getTable()
 * Table actors = db.getTable("actor_list");
 * actors.isView() // Returns true
 * actors.select("*").execute();
 * 
 * // Alters the view
 * Table view = db.alterView("actor_list")
 *              .definedAs(table.select("concat(first_name, \" \", last_name) as full_name"))
 *              .execute();
 * 
 * // Dropping the view
 * db.dropView("actor_list").ifExists().execute();
 * </pre>
 */
public interface ViewCreate extends ViewDDL<ViewCreate, ViewCreateDefined> {

}
