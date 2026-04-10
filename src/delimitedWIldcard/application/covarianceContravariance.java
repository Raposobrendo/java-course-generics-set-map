package delimitedWIldcard.application;

import java.util.ArrayList;
import java.util.List;

public class covarianceContravariance {
    public static void main(String[] Args){

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        Object x = myNums.get(0);
    }
}
