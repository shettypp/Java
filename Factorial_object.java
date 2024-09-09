// find factorial using object
import java.util.Scanner;
class Fact{
    int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        Fact o=new Fact();
        int n=o.factorial(num);
        System.out.print("Factorial of the given number " + num +  " is " + n);
    }
}
