package SearchingAlgos;

// Time-Complexity: O(Log(n))
// Space-Complexity: O(1)
public class BinarySearchItr {
    public int search(int[] list, int target){
        int left = 0;
        int right = list.length-1;

        while(left <= right){
            var middle = (left + right) / 2;

            if(list[middle] == target)
                return middle;
            if(target < list[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }
}
