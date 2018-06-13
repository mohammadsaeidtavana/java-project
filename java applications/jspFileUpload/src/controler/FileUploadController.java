package controler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Created by saeedtavana on 5/11/18.
 */
public class FileUploadController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void service(HttpServletRequest request, HttpServletResponse response )throws ServletException,IOException {

        System.out.println("ypppp");
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                int maxFileSize = 5000 * 1024;
                DiskFileItemFactory factory = new DiskFileItemFactory();


                // Location to save data that is larger than maxMemSize.
               // factory.setRepository(new File("c:\\temp"));
                // Create a new file upload handler
                ServletFileUpload upload = new ServletFileUpload(factory);
                // maximum file size to be uploaded.
               // upload.setSizeMax( maxFileSize );

                List <FileItem> multiparts =upload.parseRequest(request);
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        System.out.println(name);
                        item.write( new File("/Users/saeedtavana/projectimage/uploadcenter" + File.separator + name));
                    }
                }
                //File uploaded successfully
                request.setAttribute("gurumessage", "File Uploaded Successfully");
            } catch (Exception ex) {
                request.setAttribute("gurumessage", "File Upload Failed due to " + ex);
            }
        }else{

            request.setAttribute("gurumessage","No File found");
        }
        response.sendRedirect("index.jsp");

        //request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
