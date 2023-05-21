//LAB 5
// find wheather the IP Address is wildcard address, loop back address, multicast address, global address or local address

import java.net.InetAddress;

public class typeIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("0.0.0.0");
            if (address.isAnyLocalAddress()) {
                System.out.println(address + "is a wildcard address");
            }
            if (address.isLoopbackAddress()) {
                System.out.println(address + "is a loopback address");
            }
            if (address.isLinkLocalAddress()) {
                System.out.println(address + "is a link local address");
            }
            if (address.isAnyLocalAddress()) {
                System.out.println(address + "is a any local address");
            } else {
                System.out.println(address + "is a global address");
            }
            if (address.isMulticastAddress()) {
                if (address.isMCGlobal()) {
                    System.out.println(address + "is a global multicast address");
                } else if (address.isMCOrgLocal()) {
                    System.out.println(address + "is an organization wide multicast  address");
                }
            }
        } catch (Exception e) {

        }
    }
}