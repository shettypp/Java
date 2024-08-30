import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array :");
      int n = sc.nextInt();
      int [] arr=new int[n];
      System.out.println("Enter elements: ");
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int num=0;
      for(int i=0; i <n;i++){
          if(arr[i]>num){
              num=arr[i];
          }
      }
      System.out.println("largest number in the given array is : " + num);
    }
}