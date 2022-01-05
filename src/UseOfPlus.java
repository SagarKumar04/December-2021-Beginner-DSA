public class UseOfPlus {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 18;
        float f1 = 1.87f;
        float f2 = 8.14f;
        String s1 = "Java";
        String s2 = "Good";

        System.out.println(i1 + i2); //adding
        System.out.println(s1 + s2); //concatenating
        System.out.println(i1 + s1); //concatenating
        System.out.println(s2 + i2); //concatenating
        System.out.println(f1 + f2); //adding
        System.out.println(f1 + i1); //adding
        System.out.println(f2 + s1); //concatenating
        System.out.println(s2 + f1); //concatenating
    }
}
