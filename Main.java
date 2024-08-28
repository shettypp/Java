import java.util.Scanner;
class reverse{
    void reversearray(char[] arr){
        int n = arr.length;
        char[] arr1=new char[];
        for (int i =0; i<n;i++){
            for(int j=n;j<0;j--) {
                arr1[i]=arr[j];
            }
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.println("Enter array : ");
        char[] arr=new char[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        reverse o=new reverse();
        o.reversearray(arr);
        for(int i = 0; i<n; i++){

        }



    }
}