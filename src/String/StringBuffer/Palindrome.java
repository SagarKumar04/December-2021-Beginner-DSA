package String.StringBuffer;

public class Palindrome {
    public static void main(String[] args) {
        String original = "nitin";

        StringBuffer stringBuffer = new StringBuffer(original);
        stringBuffer.reverse();

        String reverse = stringBuffer.toString();

        System.out.println("Original: " + original);
        System.out.println("Reverse: " + reverse);

        if(original.equals(reverse)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
