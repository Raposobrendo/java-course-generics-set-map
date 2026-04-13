package Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        //String path = "C:\\temp\\in3.txt";
        String path = "C:\\temp\\in3.txt";
        Set<String> set = new LinkedHashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] name = line.split(" ");
                String username = name[0];

                set.add(username);

                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());

        } catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
