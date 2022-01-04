package PreCourse.SelectionStatements;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        /*
        90 - 100 -> O
        80 - <90 -> E
        70 - <80 -> A
        60 - <70 -> B
        50 - <60 -> C
        33 - <50 -> D
        <33 - F
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();
        char grade;

        if(marks > 100) {
            grade = 'X';
        }
        else if(marks >= 90) {
            grade = 'O';
        }
        else if(marks >= 80) {
            grade = 'E';
        }
        else if(marks >= 70) {
            grade = 'A';
        }
        else if(marks >= 60) {
            grade = 'B';
        }
        else if(marks >= 50) {
            grade = 'C';
        }
        else if(marks >= 33) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        if(grade == 'X') {
            System.out.println("Invalid Marks");
        }
        else {
            System.out.println("Grade: " + grade);
        }
    }
}
