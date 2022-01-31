package String.Questions;

public class Reverse {
    public static void main(String[] args) {
        String originalString = "java";
        char arr[] = originalString.toCharArray();
        int length = arr.length;

        for(int i = 0; i < (length / 2); i++) {
            /*
            swap character at index i
            with character at index (len - 1 - i)
             */
            char temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }

        String reversedString = new String(arr);

        System.out.println("Reverse: " + reversedString);
    }
}
