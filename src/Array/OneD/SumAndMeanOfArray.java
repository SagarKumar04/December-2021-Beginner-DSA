package Array.OneD;

import java.util.Scanner;

public class SumAndMeanOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        System.out.println("Please enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }

        int average = sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
