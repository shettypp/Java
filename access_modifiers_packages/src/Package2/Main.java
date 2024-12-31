package Package2;
import Package1.*;

class company {
    void displayEmployees(String name, String dept){
        System.out.println("Name="+name);
        System.out.println("Department="+dept);
    }


}

public class Main{
    public static void main(String[] args) {
        company c = new company();

        manager m = new manager(30, 1200000, 101, "ABC", "COMP", "Manager");
        System.out.println("Id: "+m.getemployeeID());
        c.displayEmployees(m.name, m.dept);
        System.out.println("Role: "+m.displayRoleInfo());
        m.conductMeeting();
        m.calculateSalary();

        engineer e = new engineer(30000, 102,"XYZ","COMP", "Engineer");
        c.displayEmployees(e.name,e.dept);
        e.workOnProject(e.name);
        e.calculateSalary();
    }
}