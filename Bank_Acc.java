//Printing the bank balance using class object method

import java.util.Scanner;
class Bank_acc{
    long account_number;
    String account_name;
    double account_balance;
    void printBalance(){
        System.out.println("Balance is : " + account_balance);
    }
}

public class Bank_Acc {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Bank_acc o=new Bank_acc();
       o.account_number=23456;
       o.account_name="prajna";
       o.account_balance=2345.55;
       o.printBalance();

    }
}
