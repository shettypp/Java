// write a java program that generates a right angled triangle pattern where each row displays a number repeated acc to the row number.
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to terminate: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
 */

// write a java program that displays the multiplication table of given integer by taking input from the user.

/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int Product=i*n;
            System.out.println(n + "*" + i + "=" + Product);
        }
    }
}

 */

// Write a java program to reverse an array

public class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n=arr.length;
        System.out.println("Original array : ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[n-1-i]=arr[i];
        }
        System.out.println("Reversed array : ");
        for (int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }
}


