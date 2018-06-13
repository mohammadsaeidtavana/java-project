import jndi.getinformation;
import org.apache.catalina.Session;
import org.apache.jasper.tagplugins.jstl.core.Out;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by saeedtavana on 2/6/18.
 */
public class userCheck  extends HttpServlet{
    public void init(ServletConfig config)
    {
        String name=config.getInitParameter("hello");
        System.out.println(name);
    }
    public void service(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException
    {
        String username =request.getParameter("user");
        String password=request.getParameter("password");
        if (username.isEmpty() || password.isEmpty() || username.equals(null) || password.equals(null))
        {
            String errorText="username or password can not be empty";
            request.getSession().setAttribute("error",errorText);
            HttpSession session=request.getSession();
            session.setAttribute("error",errorText);
            session.setAttribute("hello","hello mohammad seid tavana");

            request.getRequestDispatcher("erroe.jsp").forward(request,response);

        }
        else
        {

        }
    }
}
