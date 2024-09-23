// a base class calculator has basic arithmetic operations . derive a sub class for advanced calculation.

class Calculator{
    float n1=10;
    float n2=5.5f;
    float sum=n1+n2;
    float sub=n1-n2;
    float div=n1/n2;
    float mul=n1*n2;
    void print_result(){
        System.out.println("SIMPLE CALCULATOR : ");
        System.out.println("Addition is : " + sum);
        System.out.println("subtraction is : " + sub);
        System.out.println("Multiplication  is : " + mul);
        System.out.println("Division is : " + div);
    }
}

class Advanced_cal extends Calculator{
    float mod=n1%n2;
    void print(){
        System.out.println("ADVANCED CALCULATOR : ");
        System.out.println("Modulus is : " + mod);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        Advanced_cal c2=new Advanced_cal();
        System.out.println("Calculator1: ");
        c1.print_result();
        System.out.println("Calculator2: ");
        c2.print_result();
        c2.print();

    }
}