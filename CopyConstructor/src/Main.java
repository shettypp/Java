class Student{
    String name;
    int rollno;

    Student(Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
    }
    Student(){
        System.out.println("Hellooo!!!!");
    }
    void display(){
        System.out.println(name+" , "+rollno);
    }

}

public class Main {
    public static void main(String[] args){
        Student s=new Student();
        s.name="Prajna";
        s.rollno=339;

        Student s2=new Student(s);

        s2.display();
    }
}