import java.util.Scanner;
class Vehicle{
    String Model, Year;
    Float distance,fuel;
    float mileage;
    Scanner sc=new Scanner(System.in);
    Vehicle(){
        System.out.println("Enter Model, Year: ");
        String m=sc.next();
        String y=sc.next();
        Model=m;
        Year=y;
    }
    void Display(){
        System.out.println("Model : " + Model + ", Year : "+Year);
    }
    void Cal_mileage(){
        System.out.println("Enter distance,fuel: ");
        distance=sc.nextFloat();
        fuel=sc.nextFloat();
        mileage= distance/fuel;
        System.out.println("Mileage is : "+ mileage+ "km/l");
    }
}
class car extends Vehicle{
    String seating_capacity,number_doors;
    Scanner sc=new Scanner(System.in);
    car(){
        System.out.println("Enter Seating capacity,number of doors: ");
        seating_capacity=sc.next();
        number_doors=sc.next();
    }
    void Display(){
        System.out.println("Model: "+ Model +", Year : " + Year +", Seating capacity: "+seating_capacity+", Number of doors: "+ number_doors);
        Cal_mileage();
    }
}

class truck extends Vehicle {
    String carrying_capacity;
    Scanner sc =new Scanner(System.in);
    truck(){
        System.out.println("Enter carrying capacity: ");
        carrying_capacity=sc.next();
    }
    void Display(){
        System.out.println("Model: "+ Model +", Year : " + Year +", Carrying capacity: "+ carrying_capacity);
        Cal_mileage();
    }

}
class two_wheeler extends Vehicle{
    String horse_power,color;
    Scanner sc=new Scanner(System.in);
    two_wheeler(){
        System.out.println("Enter horsepower and color : ");
        horse_power=sc.next();
        color=sc.next();
    }
    void Display(){
        System.out.println("Model: "+ Model +", Year : " + Year +", Horsepower: " +horse_power + ", color: "+ color);
        Cal_mileage();
    }
}
public class Hierartial_inheritance {
    public static void main(String[] args) {
        System.out.println("For Two wheeler  ");
        two_wheeler w1=new two_wheeler();
        w1.Display();
        System.out.println("For Truck  ");
        truck t1=new truck();
        t1.Display();
        System.out.println("For Car ");
        car c1=new car();
        c1.Display();
    }
}
