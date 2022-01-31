package String.Questions;

public class CountNumberOfCharactersExcludingSpace {
    static void method3(String s) {
        String arr[] = s.split(" ");
        int length = s.length() - (arr.length - 1);
        System.out.println("Length (in method3()): " + length);
    }

    static void method2(String s) {
        String arr[] = s.split(" ");
        int length = 0;
        for(int i = 0; i < arr.length; i++) {
            int lengthOfCurrentWord = arr[i].length();
            length = length + lengthOfCurrentWord;
        }

        System.out.println("Length (in method2()): " + length);
    }

    static void method1(String s) {
        int length = 0;
        for(int i = 0; i < s.length(); i++) {
            //extract each character from the String
            char ch = s.charAt(i);

            //check if it is a space or not
            if(ch != ' ') {
                length++;
            }
        }

        System.out.println("Length (in method1()): " + length);
    }

    public static void main(String[] args) {
        String s = "Java is an awesome programming language";
        //method1(s);
        //method2(s);
        method3(s);
    }
}
