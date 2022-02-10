package Enum;

public class EnumExample1 {
    enum DAYS {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY}

    public static void main(String[] args) {
        for(DAYS days : DAYS.values()) {
            System.out.println("Index: " + days.ordinal());
            System.out.println("Value: " + days);
            System.out.println();
        }

        //System.out.println(DAYS.valueOf("THURSDAY").ordinal());
    }
}
