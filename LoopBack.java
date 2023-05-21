//LAB 7
// finding loopback

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.net.InetAddress;

public class LoopBack {
    public static void main(String[] args) throws SocketException {
        NetworkInterface in = NetworkInterface.getByName("lo");
        Enumeration<InetAddress> enu = in.getInetAddresses();

        while (enu.hasMoreElements()) {
            InetAddress inetAddress = enu.nextElement();
            String hostname = inetAddress.getHostAddress();
            System.out.println("host:" + hostname);
        }

    }

}