import java.util.Scanner;
public interface Payment{
    float tax= 0.05F;
    void processPayment(double amount);
}
class CreditCard implements Payment{
    double fee=100;
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of rs " +(amount+(tax*amount)+fee));
    }
}
class DebitCard implements Payment{
    double fee=200;
    public void processPayment(double amount){
        System.out.println("Processing debit card payment of rs " +(amount+(tax*amount)+fee));
    }
}
class paypal implements Payment {
    double fee=300;
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment of rs " + (amount+(tax*amount)+fee));
    }
}
class Main {
    public static void main(String args[]) {
       Payment c1= new CreditCard();
       Payment d1=new DebitCard();
       Payment p1=new paypal();
       c1.processPayment(20000);
       d1.processPayment(10000);
       p1.processPayment(15000);
    }
}

