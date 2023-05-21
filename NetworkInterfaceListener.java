
// LAB 6
// finding how many network interface is in our local machine.

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceListener {
    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> intf = NetworkInterface.getNetworkInterfaces();
        int count = 0;
        while (intf.hasMoreElements()) {
            NetworkInterface ni = intf.nextElement();
            System.out.println(ni);
            count = count + 1;
        }
        System.out.println("The total network interface is :" + count);

    }

}