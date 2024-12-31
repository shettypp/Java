abstract class Appliance{
    abstract void turnOn();
    abstract void showPowerConsumption();

}
class Fan extends Appliance{
    void turnOn(){
        System.out.println("Turned on ");
    }
    void showPowerConsumption(){
        System.out.println("Power consumption is 75 watts");
    }
}
class Light extends Appliance{
    void turnOn(){
        System.out.println("Turned on ");
    }
    void showPowerConsumption(){
        System.out.println("Power consumption is 15 watts");
    }
}
public class Main {
    public static void main(String[] args) {
       Fan f1=new Fan();
       Light l1=new Light();
       f1.showPowerConsumption();
       f1.turnOn();
       l1.showPowerConsumption();
       l1.turnOn();
    }
}