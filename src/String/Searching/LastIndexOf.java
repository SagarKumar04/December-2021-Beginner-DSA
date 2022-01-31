package String.Searching;

public class LastIndexOf {
    public static void main(String[] args) {
        String s = "abcdefghidejklmnoabcde";

        /*
        lastIndexOf() method returns the index of the last
        occurrence of the given character
         */
        int lastIndex = s.lastIndexOf('e');
        System.out.println("Last index: " + lastIndex);

        int lastIndexOfString = s.lastIndexOf("de");
        System.out.println("Last index of string: " + lastIndexOfString);
    }
}
