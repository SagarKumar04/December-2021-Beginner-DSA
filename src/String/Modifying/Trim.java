package String.Modifying;

public class Trim {
    public static void main(String[] args) {
        String s = "        This is a string            ";
        System.out.println("s: " + s);

        String sTrimmed = s.trim();
        System.out.println("sTrimmed: " + sTrimmed);
    }
}
