import java.util.Scanner;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("Enter the operation : ");
        System.out.println("1.add 2.subtract 3.multiply 4.divide 5.modulus");
        int operator = sc.nextInt();
        if(operator==1){
            System.out.println("Sum of two numbers " + number1 + " and " + number2 + " is " + (number1+number2));
        }
        else if(operator==2){
            System.out.println("Subtraction of two numbers " + number1 + " and " + number2 + " is " + (number1-number2));
        }
        else if(operator==3){
            System.out.println("Multiplication of two numbers " + number1 + " and " + number2 + " is " + (number1*number2));
        }
        else if(operator==4){
            System.out.println("Division of two numbers " + number1 + " and " + number2 + " is " + (number1/number2));
        }
        else if(operator==5){
            System.out.println("Modulus of two numbers " + number1 + " and " + number2 + " is " + (number1%number2));
        }
        else{
            System.out.println("Your input is invalid ! ");
        }
    }
}