package jndi;

import javax.el.ELException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by saeedtavana on 2/7/18.
 */
public class getinformation  {
    private static  DataSource dataSource;
    public static DataSource get() {
        try {

            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mydatabasesaeed");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return dataSource;

    }


}
