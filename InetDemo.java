//Lab 1
//find the IP Address of the HOST

import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("HOST Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            // TODO: handle exception
            // e.printStackTrace();
            System.out.println(e);
        }
    }
}