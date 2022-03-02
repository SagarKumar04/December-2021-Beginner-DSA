package Array.TwoD;

import java.util.Scanner;

public class RowWithMaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int numberOfColumns = scanner.nextInt();

        int num[][] = new int[numberOfRows][numberOfColumns];

        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < numberOfColumns; j++) {
                //num[i][j] = scanner.nextInt(); //Taking user input
                num[i][j] = (int)(Math.random() * 100 + 1); //Generating random numbers
            }
        }

        int maximumSum = 0;
        int rowWithMaximumSum = -1;
        for(int i = 0; i < numberOfRows; i++) {
            int sum = 0;

            for(int j = 0; j < numberOfColumns; j++) {
                sum = sum + num[i][j];
            }

            if(sum > maximumSum) {
                maximumSum = sum;
                rowWithMaximumSum = i;
            }
        }

        System.out.println();

        System.out.println("Array: ");
        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < numberOfColumns; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Row with Maximum Sum: " + rowWithMaximumSum);
        System.out.println("Maximum Sum: " + maximumSum);
    }
}
