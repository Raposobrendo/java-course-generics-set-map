package setStatement.application;

import com.sun.source.tree.UsesTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
    public static void main(String[] Args){

        //Set<String> set = new HashSet<>(); Unorganized and fast
        //Set<String> set = new TreeSet<>(); Organized and slower
        Set<String> set = new LinkedHashSet<>(); //Between HashSet and TreeSet, in terms of order and speed

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Desk");
        set.add("Bed");
        set.add("PC");

        set.remove("Tablet");
        print(set);

        set.removeIf(x -> x.length() <= 2);
        print(set);

        set.removeIf(x -> x.charAt(0) == 'D');
        print(set);

    }

    public static void print(Set<? extends String> e){
        for(String s : e){
            System.out.println(s);
        }
        System.out.println("------------");
    }
}
