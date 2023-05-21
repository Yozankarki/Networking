//Lab 13
// program to get content from URL.

import java.net.URL;

public class GetContent {

    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.google.com"); // Create a object of URL class u and passed
            Object o = u.getContent(); // created object of Object class o and used.g
            System.out.println("I got a" + o.getClass().getName());// Printing the output using the functions
        } catch (Exception e) {
        }
    }

}