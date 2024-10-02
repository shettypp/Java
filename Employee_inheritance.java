class Employee{
    int employee_id=1;
    String name="Prajna";
    String job_title="software dev";
    long basic_salary=12456;
    double gross_salary=basic_salary+(0.12*basic_salary)+(0.05*basic_salary);
    void salary(){
        gross_salary=basic_salary+(0.12*basic_salary)+(0.05*basic_salary);
        System.out.println("Gross Salary is : " + gross_salary );
    }
}
class Spl_employee extends Employee{
    long bonus=23432;
    void salary(){
        double total_salary=gross_salary+bonus;
        System.out.println("Total salary is : " + total_salary);
    }
}

public class Employee_inheritance {
    public static void main(String[] args) {
        Spl_employee e1=new Spl_employee();
        Employee e2=new Employee();
        e1.salary();
        e2.salary();
    }
}
