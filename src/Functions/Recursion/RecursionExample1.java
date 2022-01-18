package Functions.Recursion;

public class RecursionExample1 {
    static int counter = 0;
    static void test() {
        counter++;

        if(counter < 5) {
            System.out.println("In test()");
            test();
        }
    }
    public static void main(String[] args) {
        test();
    }
}
