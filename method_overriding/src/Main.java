import java.util.Scanner;

class College{
    String college_name;
    String location;
    College(String c,String l){
        college_name=c;
        location=l;
    }
    void display(){
        System.out.println("College name : "+college_name + ", Location : " + location);
    }
}
class Department extends College{
    String dept_name,HOD;
    Department(String c,String l ,String d,String h){
        super(c,l);
        dept_name=d;
        HOD=h;
    }
    void display(){
        super.display();
        System.out.println("Department name: "+ dept_name + ", Head of the department: "+HOD);
    }
}
class Student extends Department{
    String std_name,USN,section;
    Student(String c, String l,String d, String h,String n,String u,String s){
        super(c,l,d,h);
        std_name=n;
        USN=u;
        section=s;
    }
    void display(){
        super.display();
        System.out.println("Student name : "+std_name+", USN : "+USN+", Section : "+section);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student name, USN, Section,department name, HOD,College, Location : ");
        String n=sc.next();
        String u=sc.next();
        String s=sc.next();
        String d=sc.next();
        String h=sc.next();
        String c=sc.next();
        String l=sc.next();
        Student s1=new Student(c,l,d,h,n,u,s);
        s1.display();
    }
}
