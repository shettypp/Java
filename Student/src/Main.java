// Printing student details using class object
import java.util.Scanner;
class Student{
    int USN;
    String student_name;
    long phone_number;
    String email;
    void insert_values(int id , String name , long number , String mail){
        USN=id;
        student_name=name;
        phone_number=number;
        email=mail;
    }
    void printDetails(){
        System.out.println("USN: "+ USN + ", Name : " + student_name + ", phone number : " + phone_number + ", email id : " + email  );
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        Student student1=new Student();
        Student student2=new Student();
        student1.insert_values(1,"Prajna ", 456789, "prajna@gmail.com");
        student2.insert_values(2,"Sanjana ",987654,"sajana@gmail.com");
        student1.printDetails();
        student2.printDetails();
        student1.insert_values(2,"shetty",56789,"shetty@gmail.com");
        student1.printDetails();

    }
}