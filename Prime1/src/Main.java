import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean is_prime=true;
        System.out.println("Enter number to check : ");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("Prime Number");
        }
        for(int i=3;i<=n;i++){
            if(n%i==0){
                is_prime=false;
            }
        }
        if(is_prime){
            System.out.println("Prime Number ");
        }
        else{
            System.out.println("Not Prime Number");
        }

    }
}