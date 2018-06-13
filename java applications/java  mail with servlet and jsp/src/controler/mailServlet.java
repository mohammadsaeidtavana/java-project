package controler;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;

/**
 * Created by saeedtavana on 6/25/17.
 */
public class mailServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {

       // System.out.println(request.getRemoteAddr());


        System.out.println("---------------------------------------");
        InetAddress inetAddress=InetAddress.getByName(request.getRemoteAddr());
        System.out.println("ip address of client requested   "+inetAddress.getHostAddress());
        String ip=inetAddress.toString();
        if (ip.equals("/192.168.0.100")) {

            System.out.println("ip addess not allowed ");
            request.setAttribute("name","ip address not allowed ....");
            request.getRequestDispatcher("error.jsp").forward(request,response);

        }
       String to=null;

        try {
            to=request.getParameter("to");
            String subject=request.getParameter("subject");
            String message=request.getParameter("message");
            String host=request.getParameter("host");
            String completeHost=to+"@"+host;
            javaMail javaMail= controler.javaMail.getJavaMail();
            javaMail.send_mail(completeHost,subject,message);

            request.setAttribute("name",completeHost);
            request.getRequestDispatcher("message.jsp").forward(request,response);
            System.out.println("message hase been sent to following addresss : "+completeHost+"");
            System.out.println("-----------------------------------");

        }catch (MessagingException e)
        {
            request.setAttribute("name",to);
            request.getRequestDispatcher("error.jsp").forward(request,response);
            e.printStackTrace();
        }
    }
}
