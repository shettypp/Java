//Find the area of a circle, square, rectangle and triangle, using the method of overloading.

class Area{
    float side, length ,breadth , radius , base, height;
    double area;
    void find_Area(float r){
        radius=r;
        area=3.14*radius*radius;
        System.out.println("Area of circle is : "+ area);
    }
    void find_Area(int side){
        this.side=side;
        area=side*side;
        System.out.println("Area of square is : "+ area);
    }
    void find_Area(int l,int b){
        length=l;
        breadth=b;
        area=length*breadth;
        System.out.println("Area of rectangle is : "+ area);
    }
    void find_Area(float b,float h){
        base=b;
        height=h;
        area=0.5*base*height;
        System.out.println("Area of triangle is : "+ area);
    }
}
public class ArrayMethod_overloading {
    public static void main(String[] args) {
        Area A1 = new Area();
        Area A2 = new Area();
        Area A3 = new Area();
        Area A4 = new Area();

        A1.find_Area(2);
        A1.find_Area(2.2f,2);
        A1.find_Area(4,6);
        A1.find_Area(2.3f);

    }
}
