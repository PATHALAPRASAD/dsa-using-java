package dsa.sorting;

// Optimized java implementation of Bubble sort
public class BubbleSort {

    // An optimized version of Bubble Sort
    static void bubbleSort(int[] arr, int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    // Function to print an array
    static void printArray(int[] arr){
//        int i;
//        for (i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();

        for (int n: arr)
            System.out.print(n + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args){
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        System.out.println("Un-Sorted array: ");
        printArray(arr);
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}