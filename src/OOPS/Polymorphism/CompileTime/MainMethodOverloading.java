package OOPS.Polymorphism.CompileTime;

public class MainMethodOverloading {
    public static void main() {
        System.out.println("In user-defined main()");
    }

    public static void main(String[] args) {
        main();
    }
}
