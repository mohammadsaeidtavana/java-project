package server;

import javax.swing.*;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by saeedtavana on 7/8/17.
 */
public class server {
    private static int port=1234;
    private static Socket socket;
    private static ServerSocket serverSocket;
    public static void main(String[] args) {
        try {
            serverSocket =new ServerSocket(port);
            System.out.println("the server is started ...");

        }catch ( Exception e)
        {
            e.printStackTrace();
        }
        do {
            try {

                ImageIcon imageIcon=new ImageIcon("saeed.jpg");
                 socket = serverSocket.accept();
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(imageIcon);
                objectOutputStream.flush();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    socket.close();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }


        }while (true);
    }
}
