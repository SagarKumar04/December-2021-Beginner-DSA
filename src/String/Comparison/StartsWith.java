package String.Comparison;

public class StartsWith {
    public static void main(String[] args) {
        String s1 = "Java is a programming language";
        String s2 = "Java";
        String s3 = "jada";
        String s4 = "java";

        boolean result12 = s1.startsWith(s2);
        boolean result13 = s1.startsWith(s3);
        boolean result14 = s1.startsWith(s4);

        System.out.println("result12: " + result12);
        System.out.println("result13: " + result13);
        System.out.println("result14: " + result14);
    }
}
