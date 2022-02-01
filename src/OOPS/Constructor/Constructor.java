package OOPS.Constructor;

public class Constructor {
    int num1;
    int num2;
    int sum;

    //default constructor
    Constructor() {
        num1 = 0;
        num2 = 0;
        sum = num1 + num2;

        System.out.println(num1 + " " + num2 + " " + sum);
    }

    //parameterized constructor
    Constructor(int a) {
        num1 = a;
        num2 = a;
        sum = num1 + num2;

        System.out.println(num1 + " " + num2 + " " + sum);
    }

    Constructor(int a, int b) {
        num1 = a;
        num2 = b;
        sum = num1 + num2;

        System.out.println(num1 + " " + num2 + " " + sum);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 21;
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(a);
        Constructor constructor3 = new Constructor(a, b);
    }
}
