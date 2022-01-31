package String.StringBuffer;

public class DeleteCharAt {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a/an sparta!");
        System.out.println("Initial: " + stringBuffer);

        stringBuffer.deleteCharAt(8);
        System.out.println("Final: " + stringBuffer);
    }
}
