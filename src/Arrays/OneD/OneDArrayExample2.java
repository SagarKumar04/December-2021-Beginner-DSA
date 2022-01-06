package Arrays.OneD;

import java.util.Scanner;

public class OneDArrayExample2 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the elements of the array: ");
        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Elements of the array are: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
