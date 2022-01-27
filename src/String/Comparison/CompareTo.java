package String.Comparison;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "Applesssss";
        String s2 = "Apple";
        String s3 = "fruit";

        int result12 = s1.compareTo(s2);
        int result13 = s1.compareTo(s3);
        int result23 = s2.compareTo(s3);

        System.out.println("result12: " + result12);
        System.out.println("result13: " + result13);
        System.out.println("result23: " + result23);
    }
}
