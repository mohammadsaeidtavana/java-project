
import jndi.getinformation;
import org.apache.jasper.tagplugins.jstl.core.Out;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by saeedtavana on 2/8/18.
 */
public class GetInfo extends HttpServlet {
    @Override
    public void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(servletRequest.getRemoteAddr());

        try {

            ArrayList<String> obj=new ArrayList<String>();
            Connection connection = getinformation.get().getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT  * FROM food");
                ResultSet resultSet=preparedStatement.executeQuery();
                while (resultSet.next())
                {
                    String id=resultSet.getString("id");
                     String name=resultSet.getString("name");
                     System.out.println(id);
                     System.out.println(name);
                    obj.add(name);
                    obj.add(id);
                }



            preparedStatement.close();
            connection.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
