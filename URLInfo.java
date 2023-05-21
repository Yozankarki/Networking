//LAB 10
// Program for getting URL information.

import java.net.MalformedURLException;
import java.net.URL;

public class URLInfo {
    public static void main(String[] args) {
        try{
             URL u = new URL("https://www.google.com/search?q=facebook&oq=&aqs=chrome.0.35i39i362l8.60366454j0j7&sourceid=chrome&ie=UTF-8");
             System.out.println("The URL is"+u);
             System.out.println("The schema is"+u.getProtocol());
             System.out.println("The user info is"+u.getUserInfo());
             String host = u.getHost();
             if(host != null){
                int atSign = host.indexOf('@');
                if(atSign!= -1) host = host.substring(atSign+1);
                System.out.println("The host is "+host);


             }
             else{
                System.out.println("The host is null");

             }
             System.out.println("The port is "+u.getPort());
             System.out.println("The path is "+u.getPath());
             System.out.println("The ref is "+u.getRef());
             System.out.println("The query string is "+u.getQuery());

             

        }catch(MalformedURLException ex){
             System.out.println(ex);
            
        }

    }
}