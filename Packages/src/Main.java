import Geometry.*;
import Utilities.*;
import Geometry.rectangle.*;

class Shapes extends Circle{
      static String mail="ERTY";
}
public class Main {
    public static void main(String[] args) {
        InputHelper helper=new InputHelper();
//        Circle c1=new Circle();
        Shapes s1=new Shapes();
        double r=helper.getDoubleInput("Enter Radius : ");
//        c1.area(r);
//        c1.circumference(r);
        s1.area(r);
        s1.circumference(r);
        s1.mail="prajnashety@gmail.com";
        System.out.println(s1.mail);
        Rectangle r1=new Rectangle();
        r1.display();

        System.out.println("Name is: "+r1.name);
        System.out.println(r1.getPhoneno());
    }
}