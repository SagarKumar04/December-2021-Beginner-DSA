package String.Comparison;

public class Equals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Python";
        String str4 = "Java";

        boolean result12 = str1.equals(str2);
        boolean result13 = str1.equals(str3);
        boolean result23 = str2.equals(str3);
        boolean result14 = str1.equals(str4);

        System.out.println("result12: " + result12);
        System.out.println("result13: " + result13);
        System.out.println("result23: " + result23);
        System.out.println("result14: " + result14);
    }
}
