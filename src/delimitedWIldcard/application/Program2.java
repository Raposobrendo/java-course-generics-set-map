package delimitedWIldcard.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] Args){

        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(3.14, 6.28);
        List<Object> objs = new ArrayList<>();

        copy(ints, objs);
        printList(objs);
        copy(doubles, objs);
        printList(objs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for(Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty.");
        }
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
