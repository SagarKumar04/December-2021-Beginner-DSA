package PreCourse.AssignmentQuestionsDec26;

/*
URL: https://my.newtonschool.co/playground/code/vogyzecru6x5/
 */

public class QueenAttack {
    static int queenAttack(int X, int Y, int P, int Q){
        if(X == P
        || Y == Q
        || Math.abs(X - P) == Math.abs(Y - Q)) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = queenAttack(1, 2, 3, 4);

        System.out.println(result);
    }
}
