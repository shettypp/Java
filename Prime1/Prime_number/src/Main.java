import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter ending number: ");
        int n2 = sc.nextInt();

        // Define a maximum number of primes to store
        final int MAX_PRIMES = 1000;
        int[] num = new int[MAX_PRIMES];
        int count = 0;

        // Iterate through the range
        for (int i = n1; i <= n2; i++) {
            if (i > 1) { // 1 is not a prime number
                boolean isPrime = true;
                // Check if the current number is prime
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    if (count < MAX_PRIMES) {
                        num[count++] = i; // Store the prime number and increment count
                    } else {
                        System.out.println("Reached maximum capacity for storing primes.");
                        break;
                    }
                }
            }
        }

        // Print the list of prime numbers
        System.out.println("List of prime numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(num[i]);
        }
    }
}
