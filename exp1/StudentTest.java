/* 
 * Aim: WAP to store and display information of a few students.
 * Information: Name, UIN, CGPA
 *
 * Student Name: Maaz Ismail Sayyed
 * UIN: 251P139
 */

class Student {
    String name;
    String uin;
    double cgpa;

    // Method to display student details
    void display() {
        System.out.println("----------------------------");
        System.out.println("Name : " + name);
        System.out.println("UIN  : " + uin);
        System.out.println("CGPA : " + cgpa);
        System.out.println("----------------------------");
    }
}

public class StudentTest {

    public static void main(String[] args) {

        // Student 1
        Student s1 = new Student();
        s1.name = "Maaz Sayyed";
        s1.uin = "251P139";
        s1.cgpa = 8.3;

        // Student 2
        Student s2 = new Student();
        s2.name = "Ashaz Patel";
        s2.uin = "251M003";
        s2.cgpa = 8.6;

        // Student 3
        Student s3 = new Student();
        s3.name = "Ibrar";
        s3.uin = "251M034";
        s3.cgpa = 9.99;

        // Display student details
        s1.display();
        s2.display();
        s3.display();
    }
}
