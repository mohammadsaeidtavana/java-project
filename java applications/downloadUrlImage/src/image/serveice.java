package image;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by saeedtavana on 7/11/17.
 */
public class serveice extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {

        URL url=new URL("https://s-media-cache-ak0.pinimg.com/736x/73/de/32/73de32f9e5a0db66ec7805bb7cb3f807--navy-blue-houses-blue-and-white-houses-exterior.jpg");
        BufferedImage bufferedImage=ImageIO.read(url);
        File file=new File("saeedhouse.jpg");
        ImageIO.write(bufferedImage,"jpg",file);
        bufferedImage.flush();
        String s="https://s-media-cache-ak0.pinimg.com/736x/73/de/32/73de32f9e5a0db66ec7805bb7cb3f807--navy-blue-houses-blue-and-white-houses-exterior.jpg";
        System.out.println("the file has been saved to the disk");
        request.getSession().setAttribute("ans","the image has been downloaded");
        request.getSession().setAttribute("ans1",s);
        RequestDispatcher dispatcher=request.getRequestDispatcher("ans.jsp");
        dispatcher.forward(request,response);

    }
}
