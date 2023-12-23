package SearchingAlgos;

public class TertiarySeach {
    // Time-Complexity: O(log3(n))
    public int tertiarySearch(int[] list, int target){
        return tertiarySearch(list, target, 0, list.length - 1);
    }
    private int tertiarySearch(int[] list, int target, int left, int right){
        if(left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if(list[mid1] == target)
            return mid1;
        if(list[mid2] == target)
            return mid2;
        if(target < list[mid1])
            return tertiarySearch(list, target, left, mid1-1);
        if(target > list[mid2])
            return tertiarySearch(list, target, mid2+1, right);

        return tertiarySearch(list, target, mid1+1, mid2-1);
    }
}
