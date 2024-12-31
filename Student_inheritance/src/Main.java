// Derive a class CSE_student from student class and calculate total marks of general course and cse minors

class Student{
    long USN=1234;
    String name="Prajna";
    float m1=30,m2=29,m3=28;
    void print_details(){
        System.out.println("Total marks in general subjects is : " + (m1+m2+m3));
    }
}

class CSE_student extends Student{
    String minor1="Fintech";
    String minor2="Business";
    float mark1=25;
    float mark2=29;
    void print(){
        System.out.println("Total marks in minors is : "+ (mark1+mark2));
        System.out.println("Over all marks : "+(m1+m2+m3+mark1+mark2));
    }
}
class Main{
    public static void main(String args[]){
        Student s1=new Student();
        CSE_student s2=new CSE_student();
        s1.print_details();
        s2.print();
    }
}