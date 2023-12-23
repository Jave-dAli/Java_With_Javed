package Recursion;

// check if an array is sorted(Strictly) bool(int arr[], int idx)
public class IsStrictlySortedArray {
    static boolean isSorted(int[] arr, int idx) {
        if (idx == 0)
            return true;

        if (arr[idx] <= arr[idx - 1])
            return false;
        return isSorted(arr, --idx);


    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 7};
        int idx = array.length;
        System.out.println(isSorted(array, --idx));
    }
}
