package OOPS.Interfaces;

public class FinalKeywordExample {
    final static int a = 10;
    final int b = 20;

    public static void main(String[] args) {
        System.out.println(a);

        FinalKeywordExample f = new FinalKeywordExample();
        System.out.println(f.b);

        //a = 100; -> not allowed, as 'a' is 'final'
    }
}
