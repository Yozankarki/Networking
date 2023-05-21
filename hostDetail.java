//Lab 2
//find the IP Address and Hostname of local machine.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class hostDetail {
    public static void main(String[] args)

            throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("ip address:" + address.getHostAddress());
        System.out.println("hostname:" + address.getHostName());
    }

}