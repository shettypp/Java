import java.util.Scanner;

class College {
    String college_name;
    String location;

    College(String c, String l) {
        college_name = c;
        location = l;
    }

    void display() {
        System.out.println("College name: " + college_name + ", Location: " + location);
    }
}

class Department extends College {
    String dept_name, HOD;

    Department(String c, String l, String d, String h) {
        super(c, l);
        dept_name = d;
        HOD = h;
    }

    void display() {
        super.display();
        System.out.println("Department name: " + dept_name + ", Head of the department: " + HOD);
    }
}

class Student extends Department {
    String std_name, USN, section;

    Student(String c, String l, String d, String h, String n, String u, String s) {
        super(c, l, d, h);
        std_name = n;
        USN = u;
        section = s;
    }

    void display() {
        super.display();
        System.out.println("Student name: " + std_name + ", USN: " + USN + ", Section: " + section);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 60 students
        Student[] students = new Student[60];
        int studentCount = 0; // Keeps track of how many students have been added

        while (studentCount < 60) {
            System.out.println("Enter 1 for entering details, 2 to display all students, or 3 to exit: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Collect student details
                System.out.println("Enter Student name, USN, Section, Department name, HOD, College, Location: ");
                String n = sc.next();
                String u = sc.next();
                String s = sc.next();
                String d = sc.next();
                String h = sc.next();
                String c = sc.next();
                String l = sc.next();

                // Create a new Student object and store it in the array
                students[studentCount] = new Student(c, l, d, h, n, u, s);
                studentCount++;

                System.out.println("Student details added successfully. Total students entered: " + studentCount);
            } else if (choice == 2) {
                // Display details of all students entered so far
                if (studentCount == 0) {
                    System.out.println("No students have been entered yet.");
                } else {
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println("\nDetails of Student " + (i + 1) + ":");
                        students[i].display();
                    }
                }
            } else if (choice == 3) {
                // Exit the loop
                break;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }

        if (studentCount >= 60) {
            System.out.println("Maximum of 60 students reached. Exiting...");
        }

        sc.close();
    }
}
