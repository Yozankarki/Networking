//Lab 4
// Lab program to find the IPV4 and IPV6 addresses.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressDetector {

    public static void main(String[] args) {
        String ipAddress = "192.168.1.2"/* "2001:0db8:85a3:0000:0000:8a2e:0370:7334" */;
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            if (inetAddress instanceof java.net.Inet4Address) {
                System.out.println(ipAddress + " is an IPv4 address");
            } else if (inetAddress instanceof java.net.Inet6Address) {
                System.out.println(ipAddress + " is an IPv6 address");
            } else {
                System.out.println(ipAddress + " is not a valid IP address");
            }
        } catch (UnknownHostException ex) {
            System.err.println("Could not determine IP version for " + ipAddress);
        }
    }
}
