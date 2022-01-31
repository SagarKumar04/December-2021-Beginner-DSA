package String.Modifying;

public class Substring {
    public static void main(String[] args) {
        String s = "This is an example for understanding substring().";
        String s1 = s.substring(5);
        System.out.println("s1: " + s1);

        String s2 = s.substring(5, 16);
        System.out.println("s2: " + s2);
    }
}
