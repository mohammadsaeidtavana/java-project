package controler;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.*;
import net.glxn.qrgen.core.*;

/**
 * Created by saeedtavana on 6/11/18.
 */
public class QRcodeGenerate extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("servlet");

        try {

            String qrtext = request.getParameter("value");

            ByteArrayOutputStream out = net.glxn.qrgen.javase.QRCode.from("hello").to(
                    ImageType.PNG).stream();

            response.setContentType("image/png");
            response.setContentLength(out.size());

            OutputStream outStream = response.getOutputStream();

            outStream.write(out.toByteArray());

            outStream.flush();
            outStream.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
