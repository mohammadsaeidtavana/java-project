package controler;

import model.bl.personBL;
import model.to.person;

import javax.imageio.IIOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 6/9/2017.
 */
public class getServlet extends HttpServlet{
    private personBL personBL= model.bl.personBL.getPersonBL();
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       try {
            request.setAttribute("list",personBL.getAll());
            request.getRequestDispatcher("list.jsp").forward(request,response);
            System.out.println("hellodhidsfhodi get");
        }catch (Exception e)
        {

            request.setAttribute("error",e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request,response);

        }
        System.out.println("getservie...");


    }

}
