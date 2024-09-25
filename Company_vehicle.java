import java.util.Scanner;

class Vehicle{
    int Wheels;
    String model;
    String brand;
    int seating_capacity;
    static String owner;
    float max_weight;
    double distance, fuel_consumed;

    static{
        owner="Infosys";
    }
    void mileage(double d,double f){
        distance=d;
        fuel_consumed=f;
        double mileage=distance/fuel_consumed;
        System.out.println("Mileage is : " + mileage+ " KM/l");
    }
    void mileage(double d,double f,int s){
        distance=d;
        fuel_consumed=f;
        double mileage=distance/fuel_consumed;
        System.out.println("Mileage is : " + mileage+ " KM/l");
    }
    void mileage(double d,double f,float load){
        distance=d;
        fuel_consumed=f;
        if(load>max_weight){
            System.out.println("Overloaded , Mileage is less !");
        }
        else {
            double mileage = distance / fuel_consumed;
            System.out.println("Mileage is : " + mileage + " KM/l");
        }
    }
    // two wheeler or 4 wheeler
    Vehicle(int w,String m,String b,int s){
        Wheels=w;
        model=m;
        brand=b;
        seating_capacity=s;
        print_details();
    }
    //heavy vehicle
    Vehicle(int w,String m,String b, int s,float max){
        Wheels=w;
        model=m;
        brand=b;
        seating_capacity=s;
        max_weight=max;
        print_details();
    }
    void print_details(){
        System.out.println("Owner : "+ owner);
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
        System.out.println("Seating capacity : "+seating_capacity );
        if(max_weight>0) {
            System.out.println("Maximum weight is : " + max_weight);
        }
    }

}

public class Company_vehicle {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("Enter vehicle details...! ");
       System.out.println();
       System.out.println("Enter model name : ");
       String m=sc.next();
       System.out.println("Enter brand name : ");
       String b=sc.next();
       System.out.println("Enter number of seats : ");
       int s=sc.nextInt();
       System.out.println("Enter number of wheels : ");
       int w=sc.nextInt();
       Vehicle v;
       if(w>4){
           System.out.println("Enter maximum load : ");
           float max=sc.nextFloat();
           v=new Vehicle(w,m,b,s,max);
       }
       else{
           v=new Vehicle(w,m,b,s);
       }
       System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("Calculating mileage of your vehicle..!  ");
       System.out.println();
       System.out.println("Enter distance traveled : ");
       double d=sc.nextDouble();
       System.out.println("Enter fuel used : ");
       Double f=sc.nextDouble();
        if(w==2){
            v.mileage(d,f);
        }
        else if(w==4){
            v.mileage(d,f,s);
        }
        else{
            System.out.println("Enter the present load on vehicle : ");
            float load=sc.nextFloat();
            v.mileage(d,f,load);
        }
    }
}
