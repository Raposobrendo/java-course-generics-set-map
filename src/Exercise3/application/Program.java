package Exercise3.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] Args){


        Map<String, Integer> candidates = new HashMap<>();

        String path = "C:\\temp\\in4.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){

                String[] fields = line.split(",");
                if (!candidates.containsKey(fields[0])){
                    candidates.put(fields[0], Integer.parseInt(fields[1]));
                } else {
                    candidates.put(fields[0], candidates.get(fields[0]) + Integer.parseInt(fields[1]));
                }

                line = br.readLine();
            }

            for(Map.Entry<String, Integer> entry : candidates.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
