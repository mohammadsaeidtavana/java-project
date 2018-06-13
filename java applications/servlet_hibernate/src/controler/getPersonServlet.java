package controler;

import model.bl.personBL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 6/9/2017.
 */
public class getPersonServlet extends HttpServlet{
    private personBL personBL= model.bl.personBL.getPersonBL();
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("get one perosn ........ ");
       try {
           int id=Integer.parseInt(request.getParameter("bookid"));
            request.setAttribute("list2",personBL.getOnperosn(id));
            request.getRequestDispatcher("book.jsp").forward(request,response);

        }catch (Exception e)
        {

            request.setAttribute("error",e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request,response);

        }
        System.out.println("getPersonservie...");


    }

}
