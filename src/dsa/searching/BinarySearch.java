package dsa.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 11, 13, 17, 19};
        int key = 13;

        int resultIndex = binarySearch(array, 0, array.length - 1, key);
        System.out.println(resultIndex);
    }

    private  static int binarySearch(int[] a, int l, int r, int x) {
        System.out.println("entered");
        if (l <= r) {
            int m = l + (r - l) / 2;
            if (x == a[m]) return m;
            else if (x < a[m]) return binarySearch(a, l, m - 1, x);
            else return binarySearch(a, m + 1, r, x);
        }
        return -1;
    }
}
