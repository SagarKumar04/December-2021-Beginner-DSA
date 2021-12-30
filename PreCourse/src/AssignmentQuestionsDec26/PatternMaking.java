package AssignmentQuestionsDec26;

/*
URL: https://my.newtonschool.co/playground/code/p5l2t3o96c97/
 */

public class PatternMaking {
    public static void patternMaking(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternMaking(5);
    }
}
