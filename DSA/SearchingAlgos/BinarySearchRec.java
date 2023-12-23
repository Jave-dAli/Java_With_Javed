package SearchingAlgos;

// The following code gives desired result in O(Log(n)) in worst case.
// Space complexity depends upon no. of recursive calls.
public class BinarySearchRec {
    public int binarySearch(int[] list, int target){
        return binarySearch(list, target, 0, list.length-1);
    }
    private static int binarySearch(int[] list, int target, int left, int right){
        if(right < left)
            return -1;
        int middle = left + (right-left) / 2;
        if(list[middle] == target)
            return middle;
        if(target < list[middle])
            return binarySearch(list, target, left, middle-1);
        else
            return binarySearch(list, target, middle+1, right);
    }
}
