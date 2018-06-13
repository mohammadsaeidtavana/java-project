import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by saeedtavana on 7/8/17.
 */
public class main {
    public static void main(String[] args) {
        try {


            URL url=new URL("http://blog.caranddriver.com/wp-content/uploads/2016/11/BMW-M2-lead.jpg");
            BufferedImage bufferedImage=ImageIO.read(url);
            File file=new File("saeedcar14.jpg");
            ImageIO.write(bufferedImage,"jpg",file);
            bufferedImage.flush();
            System.out.println("image has been write");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
