package String;

public class Concatenation {
    public static void main(String[] args) {
        //String concatenation
        String s1 = "Java" + "Program";
        System.out.println("s1: " + s1);

        String s2 = "Java" + 123;
        System.out.println("s2: " + s2);

        String s3 = "Four " + 2 + 2;
        System.out.println("s3: " + s3);

        String s4 = "Four " + (2 + 2);
        System.out.println("s4: " + s4);

        String s5 = 2 + 2 + " Four";
        System.out.println("s5: " + s5);

        //
        String s6 = s4.concat(s5);
        System.out.println("s6: " + s6);
    }
}
