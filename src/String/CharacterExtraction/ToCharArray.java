package String.CharacterExtraction;

public class ToCharArray {
    public static void main(String[] args) {
        String s = "Java is a programming language.";
        char sArr[] = s.toCharArray();

        System.out.println("Character array:");
        for(int i = 0; i < sArr.length; i++) {
            System.out.println("char: " + sArr[i]);
        }
    }
}
