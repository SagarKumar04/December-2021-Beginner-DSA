package OOPS.Polymorphism.RunTime;

class A {
    void test() {
        System.out.println("In test() of class A");
    }
}

class B extends A {
    void test() {
        System.out.println("In test() of class B");
        //super.test();
        System.out.println("In test() of class B");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        B b = new B();
        b.test();

        /*
        We can assign object of child class to reference of parent
        class
         */
        A a = new B();
        a.test();

        /*
        We cannot assign object of parent class to reference of
        child class
        B b1 = new A();
         */
    }
}
