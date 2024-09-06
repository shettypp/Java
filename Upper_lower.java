// Write a program to find the number of uppercase and lowercase in the given word . Using inbuild functions.

import java.util.Scanner;

public class Upper_lower{
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
 
