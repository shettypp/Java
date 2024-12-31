import java.util.Scanner;
class Employee{
    int employee_id;
    String name;
    String job_title;
    double basic_salary;
    double gross_salary;

    Employee(){
        employee_id=1;
        name="PRAJNA";
        job_title="frontend dev";
        basic_salary=1000000;
        this.grossSalary();
    }
    Employee(int employee_id, String name, String job_title, double basic_salary){
        this.employee_id=employee_id;
        this.name=name;
        this.job_title=job_title;
        this.basic_salary=basic_salary;
        this.grossSalary();
    }

    void grossSalary(){
        gross_salary=basic_salary+(0.12*basic_salary)+(0.05*basic_salary);
        System.out.println("Id : " + employee_id + ", Name : " + name + ", Job :" + job_title);
        System.out.println("Your gross salary is : " + gross_salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee E1=new Employee();
        Employee E2=new Employee(2,"abc","software dev", 120000);
        System.out.println("Enter id : ");
        int id=sc.nextInt();
        System.out.println("Enter name : ");
        String n=sc.next();
        System.out.println("Enter job : ");
        String j=sc.next();
        System.out.println("Enter basic salary : ");
        double bs=sc.nextDouble();
        Employee E3=new Employee(id,n,j,bs);

    }
}