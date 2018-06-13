package ip;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by saeedtavana on 5/26/17.
 */
public class ipcheck {

    public static void main(String[] args) {
        try {

            InetAddress address;

            System.out.println(Inet4Address.getLocalHost().getHostAddress());
            System.out.println(Inet4Address.getLocalHost());
            //System.out.println(address.toString());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
