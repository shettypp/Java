import java.util.Scanner;
public class Menu_driven_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter operation : ");
            System.out.println("1.add 2.subtract 3.multiply 4.divide 5.modulus 6.exit");
            int operator=sc.nextInt();
            System.out.println("Enter two numbers: ");
            int number1=sc.nextInt();
            int number2=sc.nextInt();
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
            else if(operator==6){
                break;
            }
            else{
                System.out.println("You enter invalid input !");
            }
        }

    }
}