//LAB 12
// Program to find the inform URI

import java.net.URI;
import java.net.URISyntaxException;
public class URIInform {
    public static void main(String[] args) throws URISyntaxException {
        String uribase = "https://www.test.org/";
        String urirelative = "languages/.../java";

        URI uriBase = new URI(uribase);
        System.out.println("Base URI="+uriBase.toString());
        URI uriRelative = new URI(urirelative);
        System.out.println("Relative URI ="+uriRelative.toString());
        URI uriResolved = uriBase.resolve(uriRelative);
        System.out.println("Resolved URI ="+uriResolved.toString());

        
    }
    
}
