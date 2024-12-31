import java.util.Scanner;
class Customer{
    String customer_name,number;
    float discount,gross_amount;
    Customer(){
        customer_name="prajna";
        number="2345678";
    }
    void Gross_bill() {
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Customer Number: " + number);
        System.out.println("Base class Gross_bill() method called");
    }

}
class Discount extends Customer{
    float bill_amount;
    Scanner sc=new Scanner(System.in);
    Discount(){
        System.out.println("Enter bill amount : ");
        bill_amount=sc.nextFloat();
        if(bill_amount>=1000){
            discount=bill_amount*(5.0f/100);
        }
        else if(bill_amount<1000 && bill_amount<=500){
            discount=bill_amount*(2.0f/100);
        }
        else if(bill_amount>0 && bill_amount<500){
            discount=bill_amount*(1.0f/100);
        }
        else{
            System.out.println("You haven't shopped yet..!");
            discount=0;
        }
    }
    void Gross_bill(){
        super.Gross_bill();
        gross_amount=bill_amount-discount;
        System.out.println("Discount applied: " + discount);
        System.out.println("Your gross amount is: " + gross_amount);
    }

}

public class Main {
    public static void main(String[] args) {
        // method overriding
        Discount d=new Discount();
        d.Gross_bill();
        //runtime polymorphism
        Customer c=new Discount();
        c.Gross_bill();
    }
}