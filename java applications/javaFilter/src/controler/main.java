package controler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by saeedtavana on 7/14/17.
 */
public class main extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("this is the main server controler");
    }
}
