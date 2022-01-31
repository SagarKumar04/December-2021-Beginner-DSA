package String.StringBuffer;

public class LengthAndCapacity {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Testing ");
        int length = s.length();
        System.out.println("Length 1: " + length);

        int capacity = s.capacity();
        System.out.println("Capacity 1: " + capacity);

        s.append(" again");
        length = s.length();
        System.out.println("Length 2: " + length);

        capacity = s.capacity();
        System.out.println("Capacity 2: " + capacity);

        s.append(" just to be sure.");
        length = s.length();
        System.out.println("Length 3: " + length);

        capacity = s.capacity();
        System.out.println("Capacity 3: " + capacity);

        s.append(" Adding once more, to test.");
        length = s.length();
        System.out.println("Length 4: " + length);

        capacity = s.capacity();
        System.out.println("Capacity 4: " + capacity);
    }
}
