package HashTables;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map=new java.util.HashMap<>();
        map.put(1, "Javed");
        map.put(3, "Jitandar");
        map.put(2, "Hassan");
        map.put(5, "Sajjad");
        map.put(5, "Rafay");
        for(var item:map.entrySet())
            System.out.println(item);
        System.out.println(map);

    }
}
