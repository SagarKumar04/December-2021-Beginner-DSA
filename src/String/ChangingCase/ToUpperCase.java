package String.ChangingCase;

public class ToUpperCase {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s1Upper = s1.toUpperCase();
        System.out.println("s1Upper: " + s1Upper);

        String s2 = "ABCDEF";
        String s2Upper = s2.toUpperCase();
        System.out.println("s2Upper: " + s2Upper);

        String s3 = "aBCdEf";
        String s3Upper = s3.toUpperCase();
        System.out.println("s3Upper: " + s3Upper);
    }
}
