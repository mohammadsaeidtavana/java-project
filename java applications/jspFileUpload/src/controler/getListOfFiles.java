package controler;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

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
public class getListOfFiles extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response )throws ServletException,IOException {

        File folder = new File("/Users/saeedtavana/projectimage/uploadcenter");
        File[] listOfFiles = folder.listFiles();

        List<String> filename=new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String name=listOfFiles[i].getName();
                filename.add(name);
            } else if (listOfFiles[i].isDirectory()) {
                String name=listOfFiles[i].getName();
                filename.add(name);
            }
        }
        request.getSession().setAttribute("listfile",filename);
        response.sendRedirect("listOfFiles.jsp");

    }
}
