package Package1;

public class manager extends employee{
    private int teamsize;
    public manager(int teamsize,float salary, int id, String name, String dept, String role){
        super(salary, id,name,dept,role);
        this.teamsize = teamsize;
    }
    public String displayRoleInfo(){
        return super.role;
    }
    public void conductMeeting(){
        System.out.println("Manger "+super.name+" is conducting meeting for "+teamsize+" members");
    }
}