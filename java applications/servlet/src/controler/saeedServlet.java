package controler;

import model.person;
import model.personbl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by saeedtavana on 6/7/17.
 */
public class saeedServlet extends HttpServlet {
    public void init(ServletConfig config)
    {

    }
    public void service(HttpServletRequest request , HttpServletResponse response)throws IOException,ServletException
    {
        try {

            String naem = request.getParameter("na");

            String family = request.getParameter("fa");

            person person = new person();
            person.setName(naem);
            person.setFmaily(family);
            person.setId(model.person.getCounter());
            personbl personbl = model.personbl.getPersonbl();
            personbl.insert(person);
            request.setAttribute("name",naem);
            request.setAttribute("fname",family);
            request.getRequestDispatcher("registerdon.jsp").forward(request,response);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
