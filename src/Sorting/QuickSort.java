package Sorting;

public class QuickSort {
    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int getPartitionIndex(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        int partitionIndex;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                //swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        partitionIndex = i + 1;
        //swap arr[partitionIndex] and arr[high]
        swap(arr, partitionIndex, high);

        return partitionIndex;
    }

    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int partitionIndex = getPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 11, 3, 10, 9, 15, -17, 100};
        int length = arr.length;

        quickSort(arr, 0, length - 1);

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
