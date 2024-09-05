// Create a method , calculate total marks for set of 3 students and print total marks with their roll number and name . initialize object using a parameterized contructor and a default constructor
/*
class Student{
    int total_marks;
    int roll_no;
    String name;
    int m1,m2,m3;

    Student(){
        roll_no=1;
        name="Prajna Shetty";
        m1=20;
        m2=19;
        m3=18;
    }
    Student(int r , String n, int M1,int M2,int M3){
        roll_no=r;
        name=n;
        m1=M1;
        m2=M2;
        m3=M3;
    }
    void total_marks(){
        total_marks=m1+m2+m3;
        System.out.println("Name : " +name + ",  Roll Number : " + roll_no + ",  Total Marks : " + total_marks );
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(2,"Abc",20,17,16);
        Student s3 = new Student(3,"Xyz",15,18,10);

        s1.total_marks();
        s2.total_marks();
        s3.total_marks();

    }
}
*/

//Create array to store marks for tha same program
class Student{
    int total_marks;
    int roll_no;
    String name;
    int[] arr=new int[3];
    int m1,m2,m3;
    arr[0]=m1;
    arr[1]=m2;
    arr[2]=m3;

    Student(){
        roll_no=1;
        name="Prajna Shetty";
        m1=20;
        m2=19;
        m3=18;
    }
    Student(int r , String n, int M1,int M2,int M3){
        roll_no=r;
        name=n;
        m1=M1;
        m2=M2;
        m3=M3;
    }
    void total_marks(){
        total_marks=m1+m2+m3;
        System.out.println("Name : " +name + ",  Roll Number : " + roll_no + ",  Total Marks : " + total_marks );
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(2,"Abc",20,17,16);
        Student s3 = new Student(3,"Xyz",15,18,10);

        s1.total_marks();
        s2.total_marks();
        s3.total_marks();

    }
}