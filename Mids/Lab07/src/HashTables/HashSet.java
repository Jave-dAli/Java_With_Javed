package HashTables;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new java.util.HashSet<>();
        int[] array={1, 2, 3, 4, 5, 4, 3, 2, 1};
        for(var i:array)
            set.add(i);
        System.out.println(set);
    }
}
