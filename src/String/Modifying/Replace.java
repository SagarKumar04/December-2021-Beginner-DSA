package String.Modifying;

public class Replace {
    public static void main(String[] args) {
        String s = "This is an example for understanding substring().";

        String s1 = "for";
        String s2 = "of";
        String sNew1 = s.replace(s1, s2);
        System.out.println("sNew1: " + sNew1);

        char c1 = ' ';
        char c2 = '_';
        String sNew2 = s.replace(c1, c2);
        System.out.println("sNew2: " + sNew2);
    }
}
