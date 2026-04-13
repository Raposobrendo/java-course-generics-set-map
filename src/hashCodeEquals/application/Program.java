package hashCodeEquals.application;

import hashCodeEquals.model.entities.Client;

public class Program {
    public static void main(String[] Args){
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Maria", "alex@gmail.com");
        Client c4 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c1 == c4);
        // equals compare the content, "==" compare the information allocated on heap


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        // Compiler treats s1 and s2 in the same way. s3 and s4 are treated like different objects
    }
}
