package Exercise2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        Set<Integer> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int quantity = sc.nextInt();
        for(int i = 0; i < quantity; i++){
            students.add(sc.nextInt());
        }
        System.out.print("How many students for course B? ");
        quantity = sc.nextInt();
        for(int i = 0; i < quantity; i++){
            students.add(sc.nextInt());
        }
        System.out.print("How many students for course C? ");
        quantity = sc.nextInt();
        for(int i = 0; i < quantity; i++){
            students.add(sc.nextInt());
        }

        System.out.println("Total students: " + students.size());
    }
}
