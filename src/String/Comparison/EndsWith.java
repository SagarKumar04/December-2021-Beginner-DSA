package String.Comparison;

public class EndsWith {
    public static void main(String[] args) {
        String s1 = "Java is a programming language";
        String s2 = "ming language";
        String s3 = "Java";
        String s4 = "Language";

        boolean result12 = s1.endsWith(s2);
        boolean result13 = s1.endsWith(s3);
        boolean result14 = s1.endsWith(s4);

        System.out.println("result12: " + result12);
        System.out.println("result13: " + result13);
        System.out.println("result14: " + result14);
    }
}
