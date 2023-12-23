package SearchingAlgos;

public class Main {


    public static void main(String[] args) {
        int[] testcases = {};

        BinarySearchItr binarySearchItr = new BinarySearchItr();
        BinarySearchRec binarySearchRec = new BinarySearchRec();
        TertiarySeach tertiarySeach = new TertiarySeach();
        JumpSearch jumpSearch = new JumpSearch();

        var result = jumpSearch.jumpSearch(testcases, 6);
        System.out.println(result);
    }
}
