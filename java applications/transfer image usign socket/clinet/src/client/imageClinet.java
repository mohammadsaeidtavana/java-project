package client;


import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by saeedtavana on 7/8/17.
 */
public class imageClinet extends JFrame {
    private InetAddress host;
    private final int PORT = 1234;
    private ImageIcon image;
    public static void main(String[] args) {
        try {

            imageClinet pictureFrame = new imageClinet();
            //Ideally, size of image should be
            //known in advance...
            pictureFrame.setSize(340, 315);
            pictureFrame.setVisible(true);
            pictureFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public imageClinet()throws Exception
    {
        try {
            host = InetAddress.getLocalHost();
        }
        catch(UnknownHostException uhEx)
        {
            System.out.println("Host ID not found!");
            System.exit(1);
        }
        try {
            Socket connection = new Socket(host,PORT);
            ObjectInputStream inStream =
                    new ObjectInputStream(
                            connection.getInputStream());
            //Steps 4 and 5...
            image = (ImageIcon)inStream.readObject();//read from socket



            //Remember to close the socket...
            connection.close();
        }
        catch(IOException ioEx)
        {
            System.out.println("can not save file");
        }
        catch(ClassNotFoundException cnfEx)
        {
            cnfEx.printStackTrace();
        }

        //Now cause the paint method to be invoked...
        repaint();
    }
    public void paint(Graphics g)
    {
        //Define paint to display the image
        //upon the application frame...
        image.paintIcon(this,g,0,0);
    }
}

