package String.Searching;

public class IndexOf {
    public static void main(String[] args) {
        String s = "abcdefghidejklmnoabcde";

        /*
        indexOf() method returns the index of the first
        occurrence of the given character
         */
        int firstIndex = s.indexOf('e');
        System.out.println("First index: " + firstIndex);

        int firstIndexOfString = s.indexOf("de");
        System.out.println("First index of string: " + firstIndexOfString);

        int firstIndexOfCharFromAnIndex = s.indexOf('e', 6);
        System.out.println("First index of char after an index: " + firstIndexOfCharFromAnIndex);

        int firstIndexOfStringFromAnIndex = s.indexOf("de", 6);
        System.out.println("First index of string after an index: " + firstIndexOfStringFromAnIndex);

        int indexOfCharNotPresent = s.indexOf('z');
        System.out.println("Index of char not present: " + indexOfCharNotPresent);

        int indexOfStringNotPresent = s.indexOf("ed");
        System.out.println("Index of string not present: " + indexOfStringNotPresent);

    }
}
