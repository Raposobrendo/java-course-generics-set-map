package delimitedWIldcard.application;

import delimitedWIldcard.model.entities.Circle;
import delimitedWIldcard.model.entities.Rectangle;
import delimitedWIldcard.model.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] Args){

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));
        System.out.println("Total area: " + myAreas(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        System.out.println("Total area: " + myAreas(myCircles));

    }

    public static double myAreas(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
