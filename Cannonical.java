// Lab 3
// find the cannonical name via IP Address

import java.net.InetAddress;

public class Cannonical {
    public static void main(String[] args) {
        try {
            InetAddress cname = InetAddress.getByName("8.8.4.4");
            System.out.println("cannonical name is:" + cname.getCanonicalHostName());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}