
//Lab 11
// program to find the information of website.
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebsiteInfo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.facebook.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.html", StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}