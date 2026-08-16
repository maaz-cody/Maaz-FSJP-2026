public class Employee extends Person {
    private String role;
    private double salary;
    private String employeeId;
    private int experince;

    Employee(String name, String gender, int age, String number, String role, double salary, String id, int experince) {
        super(name, gender,age, number);
        this.role = role;
        this.salary = salary;
        this.employeeId = id;
        this.experince = experince;
    }

    void display() {
        super.display();
        System.out.println("Position: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Experince: " + experince);
    }
}
