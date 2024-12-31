package Package1;

public abstract class employee{
    private float salary;
    public int id;
    public String name;
    public String dept;
    String role;
    employee(float salary, int id, String name, String dept, String role){
        this.salary = salary;
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.role = role;
    }
    protected float getSalary(){
        return salary;
    }
    abstract String displayRoleInfo();
    public int getemployeeID(){
        return id;
    }
    public double calculateSalary(){
        salary = (float) ((float) salary + (12*salary) + (0.5*salary));
        return salary;
    }

}