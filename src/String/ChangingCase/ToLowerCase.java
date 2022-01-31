package String.ChangingCase;

public class ToLowerCase {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s1Lower = s1.toLowerCase();
        System.out.println("s1Lower: " + s1Lower);

        String s2 = "ABCDEF";
        String s2Lower = s2.toLowerCase();
        System.out.println("s2Lower: " + s2Lower);

        String s3 = "aBCdEf";
        String s3Lower = s3.toLowerCase();
        System.out.println("s3Lower: " + s3Lower);
    }
}
