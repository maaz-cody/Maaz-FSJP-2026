public class Person {
    private String name;
    private String gender;
    private int age;
    private String mobileNumber;

    Person(String name, String gender, int age, String number){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobileNumber = number;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age "+age);
        System.out.println("Mobile No.: "+mobileNumber);
    }
}
