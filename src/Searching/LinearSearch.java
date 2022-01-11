package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {23, 11, 89, 109, 14, 75, 48};
        int target = 48;
        int length = arr.length;
        int i;
        for(i = 0; i < length; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index: " + i);
                break;
            }
        }

        if(i == length) {
            System.out.println("Not found");
        }
    }
}
