import java.util.Scanner;

public class Company {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter the Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Mobile Number: ");
        String number = sc.nextLine();

        System.out.print("Enter the Designation: ");
        String role = sc.nextLine();

        System.out.print("Enter the Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter the Experience: ");
        int experince = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Department: ");
        String department = sc.nextLine();

        System.out.print("Enter the Number of Projects Completed: ");
        int project = sc.nextInt();

        Manager m1 = new Manager(
                name,
                gender,
                age,
                number,
                role,
                salary,
                id,
                experince,
                department,
                project
        );

        System.out.println("\n===== Manager Details =====");
        m1.display();

        sc.close();
    }
}
