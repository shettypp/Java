import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();           // To input the string value
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        System.out.println("Hello " + name);
        System.out.println("Your name is :" + name);
        System.out.println("Your age : " + age);  // To input the integer value

    }
}