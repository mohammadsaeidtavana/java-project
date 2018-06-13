package controler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saeedtavana on 5/11/18.
 */
public class SearchOfFiles extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response )throws ServletException,IOException {

        String userinputname=request.getParameter("nameOFfile");
        File folder = new File("/Users/saeedtavana/projectimage/uploadcenter");
        File[] listOfFiles = folder.listFiles();

        List<String> filename=new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String name = listOfFiles[i].getName();
                String name2=name.substring(0,name.lastIndexOf("."));
                if (name2.equals(userinputname.trim()))
                {
                    filename.add(name);
                }
                else if(listOfFiles[i].isDirectory())
                {
                    if (name2.equals(userinputname.trim()))
                    {
                        filename.add(name);
                    }
                }
            }

        }
        request.getSession().setAttribute("listfilesearch",filename);
        response.sendRedirect("listOfFilessearch.jsp");

    }
}
