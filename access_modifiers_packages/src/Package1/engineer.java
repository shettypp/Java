package Package1;

public class engineer extends employee{
    public engineer(float salary, int id, String name, String dept, String role){
        super(salary, id,name,dept,role);
    }
    public String displayRoleInfo(){
        return super.role;
    }
    public void workOnProject(String p_name){
        System.out.println(name+" is working on "+p_name);
    }
}