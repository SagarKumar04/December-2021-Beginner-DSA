package Functions;

class Numbers {
    int num1;
    int num2;
}

public class CallByReference {
    static void swap(Numbers swapNumber) {
        int temp = swapNumber.num1;
        swapNumber.num1 = swapNumber.num2;
        swapNumber.num2 = temp;
    }

    public static void main(String[] args) {
        Numbers mainNumber = new Numbers();
        mainNumber.num1 = 19;
        mainNumber.num2 = 48;

        System.out.println("Before swapping: ");
        System.out.println("num1: " + mainNumber.num1);
        System.out.println("num2: " + mainNumber.num2);

        swap(mainNumber);

        System.out.println("After swapping: ");
        System.out.println("num1: " + mainNumber.num1);
        System.out.println("num2: " + mainNumber.num2);
    }
}
