
// Lab 9
// Program for testing protocol.

import java.net.*;

public class ProtocolTest {
    public static void main(String[] args) {
        testProtocol("https://www.abc.org");
        testProtocol("https://www.amazon.com/exec/obidos/order2/");
        testProtocol("ftp://ibiblio.org/pub/languages/java/javafaq");
        // telnet
        testProtocol("telnet://dibner.poly.edu/");
        testProtocol("file://etc/passwd");
        testProtocol("gopher://goher.anc.org.za/");
        testProtocol("nfs:/utopia.poly.edu/usr/tmp");

        // A custom protocol for jdbc
        testProtocol("jdbc:mysql://luna.ibiblio.org:3306/NEWS");

        // rmi , a custom protocol for remote method invocation
        testProtocol("rmi://ibiblio.org/RenderEngine");

    }

    private static void testProtocol(String url) {
        try {
            // URL u = new URL(url);
            URI u = URI.create(url);
            System.out.println(u.getScheme() + " is supported");
        } catch (Exception e) {
            String protocol = url.substring(0, url.indexOf(':'));
            System.out.println(protocol + " is not supported");
        }
    }
}
