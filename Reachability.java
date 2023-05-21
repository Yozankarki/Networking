//Lab 8
// check whether remote system is reachable or not.

import java.io.IOException;
import java.net.InetAddress;
public class Reachability {
    public static void main(String[] args) {
        try{
            InetAddress net = InetAddress.getByName("www.youtube.com");
            if(net.isReachable(1000)){
                System.out.println("Success");
            }
            else{
                System.out.println("Failed");
            }
        }catch(IOException e){
            throw new RuntimeException();
        }
    }
    
}

/* import java.net.InetAddress;

public class RemoteHostTester {
    public static void main(String[] args) {
        String remoteHostName = "www.google.com";
        try {
            InetAddress remoteAddr = InetAddress.getByName(remoteHostName);
            if (remoteAddr.isReachable(5000)) {
                System.out.println(remoteHostName + " is reachable.");
            } else {
                System.out.println(remoteHostName + " is not reachable.");
            }
        } catch (Exception ex) {
            System.out.println("Could not reach " + remoteHostName + ": " + ex.getMessage());
        }
    }
}
 */