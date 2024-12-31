import java.util.Scanner;
class practices{
    public double multiply (double a,double b){
        return a*b;
    }
    public String concatenate(String s1,String s2,String s3){
        return s1+s2+s3;
    }}

    public class practice{
        public static void main(String args[]){
            practices obj=new practices();
            System.out.println("The result of multiplying decimals"+obj.multiply(2.5,7.2));
            System.out.println("The result of String concatenate"+obj.concatenate("abc","xyz","uvw"));
        }
    }
