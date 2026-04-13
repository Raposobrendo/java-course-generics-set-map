package Exercise1Correction.application;

import Exercise1Correction.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        Set<LogEntry> set = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Total users: " + set.size());

        sc.close();
    }
}
