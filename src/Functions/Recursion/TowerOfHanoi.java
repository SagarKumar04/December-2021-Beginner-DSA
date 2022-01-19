package Functions.Recursion;

public class TowerOfHanoi {
    static void towerOfHanoi(int n,
                             char sourcePole,
                             char destinationPole,
                             char helperPole) {
        if(n == 1) {
            System.out.println("Move disk 1 from pole "
            + sourcePole + " to pole " + destinationPole);
        }
        else {
            towerOfHanoi(n - 1, sourcePole, helperPole, destinationPole);
            System.out.println("Move disk " + n + " from pole "
                    + sourcePole + " to pole " + destinationPole);
            towerOfHanoi(n - 1, helperPole, destinationPole, sourcePole);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
