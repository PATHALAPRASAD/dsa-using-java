package dsa.searching;

import java.util.Scanner;

public class TernarySearch
{
    static int ternarySearch (int[] A, int value, int start, int end) {
        if (start > end) return -1;

        int mid1 = start + (end-start) / 3;
        int mid2 = start + 2*(end-start) / 3;

        if (A[mid1] == value) return mid1;
        else if (A[mid2] == value) return mid2;
        else if (value < A[mid1]) return ternarySearch (A, value, start, mid1-1);
        else if (value > A[mid2]) return ternarySearch (A, value, mid2+1, end);
        else return ternarySearch (A, value, mid1,mid2);
    }
    /** Main method **/
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Ternary Search Test\n");

        /** Accept number of elements **/
        System.out.println("Enter number of integer elements");
        int n = scan.nextInt();

        /** Create integer array on n elements **/
        int arr[] = new int[ n ];

        /** Accept elements **/
        System.out.println("\nEnter "+ n +" sorted integer elements");
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();

        System.out.println("\nEnter element to search for : ");
        int key = scan.nextInt();

        int result = ternarySearch(arr, key, 0, arr.length - 1);

        if (result == -1)
            System.out.println("\n"+ key +" element not found");
        else
            System.out.println("\n"+ key +" element found at position "+ result);

    }
}