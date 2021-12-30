package AssignmentQuestionsDec26;

/*
URL: https://my.newtonschool.co/playground/code/owj8oimpjf8h/
 */

public class Triangle {
    static void printTriangle() {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle();
    }
}
