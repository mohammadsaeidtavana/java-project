package controler;

import model.bl.personBL;
import model.to.book;
import model.to.person;

import javax.security.sasl.SaslException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 6/9/2017.
 */
public class insertServlet extends HttpServlet {
    private personBL personBL= model.bl.personBL.getPersonBL();
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            String name=request.getParameter("name");
            String family=request.getParameter("family");
            String comments=request.getParameter("com");
            int age=Integer.parseInt(request.getParameter("age"));
            String bookname=request.getParameter("bookname");
            long book_price= Long.parseLong(request.getParameter("price"));
            book book=new book(bookname,book_price);
            person person=new person(age,name,family,comments);
            person.setBookLis(book);
            personBL.insert(person);
            response.sendRedirect("insertddemo.jsp");


        }catch (Exception e)
        {
            request.setAttribute("error",e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request,response);

        }
        System.out.println("insert perosn ...");

    }
}
