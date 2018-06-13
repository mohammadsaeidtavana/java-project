import org.apache.catalina.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by saeedtavana on 2/6/18.
 */
public class getsessionValue  extends HttpServlet{

    public void service (HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("hello ");
        HttpSession session=request.getSession();
        session.setAttribute("hellosaeed","hello mohammad saeid tavana");
        for (Enumeration e = session.getAttributeNames(); e.hasMoreElements(); ) {
            String attribName = (String) e.nextElement();
            Object attribValue = session.getAttribute(attribName);
            System.out.println(attribName);
            System.out.println(attribValue);
        }

    }
}
