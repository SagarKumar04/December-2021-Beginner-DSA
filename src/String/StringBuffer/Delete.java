package String.StringBuffer;

public class Delete {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a/an sparta!");
        System.out.println("Initial: " + stringBuffer);

        stringBuffer.delete(9, 12);
        System.out.println("Final 1: " + stringBuffer);

        stringBuffer.delete(8, 9);
        System.out.println("Final 2: " + stringBuffer);

        stringBuffer.delete(7, 8);
        System.out.println("Final 3: " + stringBuffer);
    }
}
