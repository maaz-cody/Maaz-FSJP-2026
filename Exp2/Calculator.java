/* AIM: WAP to create a calculator class to add two numbers.
Use constructor overloading to initialize the data with either
default values or user-provided values. Use method overloading
to add an integer or a double.

NAME: Maaz Ismail Sayyed
BATCH : SE-COMPS(A) */

public class Calculator {
    int a;
    int b;

    Calculator() {
        a = 0;
        b = 0;
    }

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void add(int m, int n) {
        int sum = m + n;
        System.out.println("Sum Of Integers : " + sum);
    }

    void add(double m, double n) {
        double sum = m + n;
        System.out.println("Sum Of Doubles : " + sum);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("A : " + c1.a + ", B : " + c1.b);

        Calculator c2 = new Calculator(3, 4);
        System.out.println("A : " + c2.a + ", B : " + c2.b);

        c1.add(3, 4);
        c1.add(2.5, 4.5);
    }
}
