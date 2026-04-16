package Exercise3.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] Args){


        Map<String, Double> candidates = new HashMap<>();

        String path = "C:\\temp\\in4.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

        } catch (Exception e){
            System.out.println("Error: " + e);
        }


    }
}
