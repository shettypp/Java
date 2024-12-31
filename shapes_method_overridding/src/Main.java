class Shape{
    void draw(){
        System.out.println("Shape Drawing......");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle drawing.... ");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle drawing....");
    }
}
public class Main {
    public static void main(String[] args)
    {
        Shape s1=new Rectangle();
        s1.draw();
        Shape s2=new Circle();
        s2.draw();
    }
}