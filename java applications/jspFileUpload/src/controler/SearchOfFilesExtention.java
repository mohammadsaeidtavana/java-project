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
public class SearchOfFilesExtention extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response )throws ServletException,IOException {

        String userinputname = request.getParameter("typee");
        File folder = new File("/Users/saeedtavana/projectimage/uploadcenter");
        File[] listOfFiles = folder.listFiles();
        List<String> filename = new ArrayList<String>();

        if (userinputname.trim().equals("dir")) {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isDirectory()) {
                    String name = listOfFiles[i].getName();
                    filename.add(name+"/");
                }

            }
        } else {


            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    String name = listOfFiles[i].getName();
                    String name2 = name.substring(name.lastIndexOf("."));

                    if (name2.equals(userinputname.trim())) {
                        filename.add(name);
                    }
                }

            }

        }
        request.getSession().setAttribute("listfilesearchex", filename);
        response.sendRedirect("listOfFilessearchExtention.jsp");
    }
}
