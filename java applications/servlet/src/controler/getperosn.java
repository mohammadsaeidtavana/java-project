package controler;

import model.personbl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by saeedtavana on 6/8/17.
 */
public class getperosn extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {


            personbl personbl = model.personbl.getPersonbl();
            request.setAttribute("list", personbl.getList());
            request.getRequestDispatcher("two.jsp").forward(request, response);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
