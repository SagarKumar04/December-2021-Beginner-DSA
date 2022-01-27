package String.CharacterExtraction;

public class GetChars {
    public static void main(String[] args) {
        String s = "Java is a programming language.";
        int sourceStart = 8;
        int sourceEnd = 21;
        char target[] = new char[sourceEnd - sourceStart];
        int targetStart = 0;

        s.getChars(sourceStart, sourceEnd, target, targetStart);

        String targetString = new String(target);
        System.out.println("targetString: " + targetString);
    }
}
