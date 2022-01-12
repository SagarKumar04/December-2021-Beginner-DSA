package Searching;

public class TernarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 18, 19, 23, 30, 89, 100};
        int target = 18;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while(start < end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if(arr[mid1] == target) {
                index = mid1;
                break;
            }
            else if(arr[mid2] == target) {
                index = mid2;
                break;
            }
            else {
                if(target < arr[mid1]) {
                    end = mid1 - 1;
                }
                else if(target > arr[mid2]) {
                    start = mid2 + 1;
                }
                else {
                    start = mid1 + 1;
                    end = mid2 - 1;
                }
            }
        }

        if(index != -1) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
