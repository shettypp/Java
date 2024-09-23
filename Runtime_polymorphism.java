class Area{
   double area;
    void area() {
        System.out.println("Hello, this is base case");
    }

    void display() {
        System.out.println("Hello, this is base case");
    }
}
class Rectangle_area extends Area{
    float length,breadth;
    Rectangle_area(){
        length=3;
        breadth=4;
        area();
    }
    void area(){
        area=length*breadth;
    }
    void display(){
        System.out.println("Area of rectangle is: "+ area);
    }
}
class Circle_area extends Area{
    float radius;
    Circle_area(){
        radius=3;
        area();
    }
    void area(){
        area=3.14*radius*radius;
    }
    void display(){
        System.out.println("Area of circle is : "+ area);
    }
}
public class Runtime_polymorphism {
    public static void main(String[] args) {
        Area r=new Rectangle_area();
        r.display(); // overriding
        Area a=new Circle_area();
        a.display();
    }
}
