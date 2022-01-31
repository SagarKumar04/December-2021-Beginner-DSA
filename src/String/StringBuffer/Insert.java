package String.StringBuffer;

public class Insert {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This sparta!");

        System.out.println("Initial: " + stringBuffer);

        stringBuffer.insert(5, "is ");

        System.out.println("Final: " + stringBuffer);
    }
}
