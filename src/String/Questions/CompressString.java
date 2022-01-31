package String.Questions;

/*
Example:
Input: AAABBCCDAA
Output: A3B2C2D1A2
 */

public class CompressString {
    public static void main(String[] args) {
        String input = "aabbaaabbb";
        char currentCharacter = input.charAt(0);
        int count = 1;
        StringBuffer stringBuffer = new StringBuffer("");

        for(int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == currentCharacter) {
                count++;
            }
            else {
                stringBuffer.append(currentCharacter);
                stringBuffer.append(count);
                currentCharacter = ch;
                count = 1;
            }
        }
        stringBuffer.append(currentCharacter);
        stringBuffer.append(count);

        String result = stringBuffer.toString();
        System.out.println("Result: " + result);
    }
}
