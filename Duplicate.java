import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements in the array:");

        // Nested loops to find duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;  // Exit inner loop after finding the first duplicate
                }
            }
        }
    }
}
