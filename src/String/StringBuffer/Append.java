package String.StringBuffer;

public class Append {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Test");
        System.out.println("s: " + s);

        s.append("ing");
        System.out.println("s: " + s);

        s.append(" again").append(" for testing.");
        System.out.println("s: " + s);
    }
}
