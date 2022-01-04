package PreCourse.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        /*
        Syntax (1-D Array):
        data-type array-name[] = new data-type[size];
         */
        int size = 3;

        //Declared the array
        float number[] = new float[size];

        //Initialized the array
        number[0] = 3.14f;
        number[1] = 9.172f;
        number[2] = -19.1028f;

        System.out.println("number[0]: " + number[0]);
        System.out.println("number[1]: " + number[1]);
        System.out.println("number[2]: " + number[2]);
    }
}
