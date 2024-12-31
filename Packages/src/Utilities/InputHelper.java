package Utilities;
import java.util.*;
public class InputHelper {
    public double getDoubleInput(String prompt){
        System.out.println(prompt);
        Scanner sc =new Scanner(System.in);
        double r=sc.nextDouble();
        return r;
    }
}
