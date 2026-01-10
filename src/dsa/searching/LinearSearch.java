package dsa.searching;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found after checking all elements
    }

    public static void main(String[] args) {
        int[] numArray = {10, 20, 25, 63, 96, 57};
        int targetValue = 63;

        int index = linearSearch(numArray, targetValue);

        if (index != -1) {
            System.out.println("Element " + targetValue + " found at index: " + index);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
