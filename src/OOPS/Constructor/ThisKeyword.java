package OOPS.Constructor;

public class ThisKeyword {
    int num1;
    int num2;

    ThisKeyword(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(1, 2);
        System.out.println(thisKeyword.num1);
        System.out.println(thisKeyword.num2);
    }
}
