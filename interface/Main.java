interface shapes{
    int n=1;
    interface size{
        void display();
    }
}
class rectangle implements shapes.size{
    int length=2;
    int breadth=3;
    public void display(){
        System.out.println(length*breadth);
    }
}
public class Main {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.display();
        System.out.println(shapes.n);
    }
}
