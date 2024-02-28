import java.util.Arrays;

public class SortingUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        recursiveSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveSort(int[] arr, int n) {
        if (n <= 0) {
            return;
        }
        int lastVal = arr[n - 1];
        recursiveSort(arr, n - 1);
        insertLastElement(arr, n, lastVal);
    }

    private static void insertLastElement(int[] arr, int n, int lastVal) {
//        System.out.println(n);
//        System.out.println(lastVal);
        if (n == 1 || arr[n - 2] < lastVal) {
            arr[n - 1] = lastVal;
            return;
        } else {
            arr[n - 1] = arr[n - 2];
            insertLastElement(arr, n - 1, lastVal);
        }
    }
}
