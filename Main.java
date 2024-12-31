//Using inbuild functions

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String n=sc.nextLine();
        char arr[]=n.toCharArray();
        int l=arr.length;
        int lower_case=0;
        int upper_case=0;
        for(int i=0;i<l;i++){
            if(Character.isLowerCase(arr[i])){
               lower_case=lower_case+1;
            }
            else{
                upper_case=upper_case+1;
            }
        }
        System.out.println("Lower case count : " + lower_case);
        System.out.println("Upper case: " + upper_case);

    }
}
 */

//Count upper and lower case without using inbuilt function

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String n=sc.nextLine();
        char arr[]=n.toCharArray();
        int l=arr.length;
        int lower_case=0;
        int upper_case=0;
        for(int i=0;i<l;i++){
            if(arr[i]>=97 && arr[i]<=122){
                lower_case=lower_case+1;
            }
            else if(arr[i]>=65 && arr[i]<=90){
                upper_case=upper_case+1;
            }
        }
        System.out.println("Lower case count : " + lower_case);
        System.out.println("Upper case: " + upper_case);

    }
}
