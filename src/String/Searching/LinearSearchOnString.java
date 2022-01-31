package String.Searching;

public class LinearSearchOnString {
    public static void main(String[] args) {
        String s = "abcdefghidejklmnoabcde";
        char target = 'e';
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == target) {
                count++;
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
}
