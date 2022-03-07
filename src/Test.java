public class Test {
    public static void main(String[] args) {
        float pi = 1234.1415926f;

        String piString = String.format("pi: %.3f", pi);

        System.out.println(piString);
    }
}