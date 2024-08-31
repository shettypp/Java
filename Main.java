import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        // Calculate factorial using iteration
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
