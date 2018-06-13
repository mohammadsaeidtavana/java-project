/*
  Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.

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

package testsuite.x.devapi;

import static org.junit.Assert.fail;

import java.net.Inet6Address;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import com.mysql.cj.api.xdevapi.NodeSession;
import com.mysql.cj.api.xdevapi.XSession;
import com.mysql.cj.core.ServerVersion;
import com.mysql.cj.core.conf.PropertyDefinitions;

import testsuite.TestUtils;

public class Ipv6SupportTest extends DevApiBaseTestCase {
    List<String> ipv6Addrs;
    String testUser = "testIPv6User";

    @Before
    public void setupIpv6SupportTest() {
        if (setupTestSession()) {
            List<Inet6Address> ipv6List = TestUtils.getIpv6List();
            this.ipv6Addrs = ipv6List.stream().map((e) -> e.getHostAddress()).collect(Collectors.toList());
            this.ipv6Addrs.add("::1"); // IPv6 loopback

            this.session.sql("CREATE USER '" + this.testUser + "'@'%' IDENTIFIED WITH mysql_native_password BY '" + this.testUser + "'").execute();
            this.session.sql("GRANT ALL ON *.* TO '" + this.testUser + "'@'%'").execute();
        }
    }

    @After
    public void teardownIpv6SupportTest() {
        if (this.isSetForXTests && this.session.isOpen()) {
            this.session.sql("DROP USER '" + this.testUser + "'@'%'").execute();
            destroyTestSession();
        }
    }

    /**
     * Tests the creation of {@link NodeSession}s referencing the host by its IPv6. This feature was introduced in MySQL 5.7.17 and requires a server started
     * with the option "mysqlx-bind-address=*" (future versions may set this value by default).
     */
    @Test
    public void testIpv6SupportInNodeSession() {
        Assume.assumeTrue("Not set to run X tests. Set the url to the X server using the property " + PropertyDefinitions.SYSP_testsuite_url_mysqlx,
                this.isSetForXTests);
        Assume.assumeTrue("Server version 5.7.17 or higher is required.", mysqlVersionMeetsMinimum(ServerVersion.parseVersion("5.7.17")));

        // Although per specification IPv6 addresses must be enclosed by square brackets, we actually support them directly.
        String[] urls = new String[] { "mysqlx://%s:%s@%s:%d", "mysqlx://%s:%s@[%s]:%d", "mysqlx://%s:%s@(address=%s:%d)", "mysqlx://%s:%s@(address=[%s]:%d)",
                "mysqlx://%s:%s@address=(host=%s)(port=%d)", "mysqlx://%s:%s@address=(host=[%s])(port=%d)" };

        int port = getTestPort();

        boolean atLeastOne = false;
        for (String host : this.ipv6Addrs) {
            if (TestUtils.serverListening(host, port)) {
                atLeastOne = true;
                for (String url : urls) {
                    String ipv6Url = String.format(url, this.testUser, this.testUser, TestUtils.encodePercent(host), port);
                    NodeSession nodeSession = this.fact.getNodeSession(ipv6Url);
                    Assert.assertFalse(nodeSession.getSchemas().isEmpty());
                    nodeSession.close();
                }
            }
        }

        if (!atLeastOne) {
            fail("None of the tested hosts have server sockets listening on the port " + port
                    + ". This test requires a MySQL server with X Protocol running in local host with IPv6 support enabled "
                    + "(set '--mysqlx-bind-address = *' if needed.");
        }
    }

    /**
     * Tests the creation of {@link XSession}s referencing the host by its IPv6. This feature was introduced in MySQL 5.7.17 and requires a server started
     * with the option "mysqlx-bind-address=*" (future versions may set this value by default).
     */
    @Test
    public void testIpv6SupportInXSession() {
        Assume.assumeTrue("Not set to run X tests. Set the url to the X server using the property " + PropertyDefinitions.SYSP_testsuite_url_mysqlx,
                this.isSetForXTests);
        Assume.assumeTrue("Server version 5.7.17 or higher is required.", mysqlVersionMeetsMinimum(ServerVersion.parseVersion("5.7.17")));

        // Although per specification IPv6 addresses must be enclosed by square brackets, we actually support them directly.
        String[] urls = new String[] { "mysqlx://%s:%s@%s:%d", "mysqlx://%s:%s@[%s]:%d", "mysqlx://%s:%s@(address=%s:%d)", "mysqlx://%s:%s@(address=[%s]:%d)",
                "mysqlx://%s:%s@address=(host=%s)(port=%d)", "mysqlx://%s:%s@address=(host=[%s])(port=%d)" };

        int port = getTestPort();

        boolean atLeastOne = false;
        for (String host : this.ipv6Addrs) {
            if (TestUtils.serverListening(host, port)) {
                atLeastOne = true;
                for (String url : urls) {
                    String ipv6Url = String.format(url, this.testUser, this.testUser, TestUtils.encodePercent(host), port);
                    XSession xSession = this.fact.getSession(ipv6Url);
                    Assert.assertFalse(xSession.getSchemas().isEmpty());
                    xSession.close();
                }
            }
        }

        if (!atLeastOne) {
            fail("None of the tested hosts have server sockets listening on the port " + port
                    + ". This test requires a MySQL server with X Protocol running in local host with IPv6 support enabled "
                    + "(set '--mysqlx-bind-address = *' if needed.");
        }
    }
}
