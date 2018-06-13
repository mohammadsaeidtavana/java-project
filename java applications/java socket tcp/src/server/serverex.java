package server;

import socketobj.person;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by saeedtavana on 5/26/17.
 */
public class serverex {

    private static ServerSocket serverSocket;
    public static void main(String[] args) {

        try {

             serverSocket = new ServerSocket(1222);
            System.out.println("server is start ...");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        do {


            handelclinet();
        }
        while (true);

    }
    public static void handelclinet()
    {
        Socket socket=null;
        try {
            person person=new person();
            person.age=10;
            person.name="saeed";
              socket = serverSocket.accept();
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(person);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {


                socket.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
