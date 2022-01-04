package PreCourse.SelectionStatements;

public class NestedIfExample {
    public static void main(String[] args) {
        int year = 2100;

        if(year % 100 == 0) {
            //century year
            if(year % 400 == 0) {
                //leap year
                System.out.println("Leap year");
            }
            else {
                //non-leap year
                System.out.println("Non-leap year");
            }
        }
        else {
            //non-century year
            if(year % 4 == 0) {
                //leap year
                System.out.println("Leap year");
            }
            else {
                //non-leap year
                System.out.println("Non-leap year");
            }
        }
    }
}