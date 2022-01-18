package Functions.Recursion;

public class RecursionExample2 {
    static void test(int counter) {
        if(counter < 5) {
            System.out.println("In test(): " + counter);
            counter++;
            test(counter);
        }
    }

    public static void main(String[] args) {
        test(0);
    }
}
