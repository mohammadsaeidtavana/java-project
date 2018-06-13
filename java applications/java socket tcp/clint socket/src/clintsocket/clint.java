package clintsocket;

import socketobj.person;

import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by saeedtavana on 5/26/17.
 */
public class clint {
    public static InetAddress inetAddress;
    public static Socket socket;
    public static InetAddress host;
    public static void main(String[] args) {

        try {

            host=inetAddress.getLocalHost();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        accessserver();

    }
    public static void accessserver()
    {
        try {
            socket =new Socket(host,1222);
            Scanner scanner=new Scanner(socket.getInputStream());
            ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            Object p= objectInputStream.readObject();
             person p1=(person)p;
            System.out.println(p1.age);
            System.out.println(p1.name);
            p1.show(100);





        }
        catch (Exception E)
        {
            E.printStackTrace();
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
