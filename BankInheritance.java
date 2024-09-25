import java.util.Scanner;
class Bank {
    String acc_name, acc_number, bank_name;
    double balance;
    Bank(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account name , account number , Bank number and balance : ");
        acc_name=sc.next();
        acc_number=sc.next();
        bank_name=sc.next();
        balance=sc.nextDouble();
    }
    void display(){
        System.out.println("Bank Name : " + bank_name);
        System.out.println("Account name: " + acc_name);
        System.out.println("Account number : "+ acc_number);
        System.out.println("Your balance amount is : " + balance);
    }
}
class Savings extends Bank{
    void deposit(double amount){
        balance=balance+amount;
    }
    void withdrawal(double amount){
        if (balance<amount){
            System.out.println("You don't have sufficient amount in your account ");
        }
        else {
            balance=balance-amount;
        }
    }
    void interest(float n, int years){
        double interestEarned=balance*n*years;
        balance=balance+interestEarned;
        System.out.println("Interest earned : " + interestEarned);
    }
}
class CurrentAccount extends Bank{
    void deposit(double amount){
        balance=balance+amount;
    }
    void withdrawal(double amount){
        if (balance<amount){
            System.out.println("You don't have sufficient amount in your account ");
        }
        else {
            balance=balance-amount;
        }
    }
}
public class BankInheritance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of account (saving or current) : ");
        String type=sc.next();
        // In java String should be compared using .equals()  and not ==
        if(type.equals("saving")){
            Savings s1=new Savings();
            System.out.println("What would you like to do? (Deposit, Withdraw, or Calculate Interest):");
            String op=sc.next();
            if(op.equals("Deposit")){
                System.out.println("Enter deposit amount : ");
                double d=sc.nextDouble();
                s1.deposit(d);
            }
            else if(op.equals("Withdraw")){
                System.out.println("Enter withdrawal amount : ");
                double w=sc.nextDouble();
                s1.withdrawal(w);
            }
            else if(op.equals("Calculate Interest")){
                System.out.println("Enter interest rate and number of years : ");
                float i=sc.nextFloat();
                int n=sc.nextInt();
                s1.interest(0.006f,n);
            }
            else{
                System.out.println("Invalid input");
            }
            s1.display();
        }
        else if(type.equals("current")){
            CurrentAccount c1=new CurrentAccount();
            System.out.println("What would you like to do? (Deposit, Withdraw) :");
            String op=sc.next();
            if(op.equals("Deposit")){
                System.out.println("Enter deposit amount : ");
                double d=sc.nextDouble();
                c1.deposit(d);
            }
            else if(op.equals("Withdraw")){
                System.out.println("Enter withdrawal amount : ");
                double w=sc.nextDouble();
                c1.withdrawal(w);
            }
            else{
                System.out.println("Invalid input");
            }
            c1.display();
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
