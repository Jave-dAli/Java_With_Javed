package HashTables;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map=new java.util.HashMap<>();
        map.put(13, "Javed");
        map.put(11, "Jitandar");
        map.put(12, "Hassan");
        map.put(15, "Sajjad");
        map.put(25, "Rafay");
        map.put(111, "Kumar");

        for(var item:map.entrySet())
            System.out.println(item.getValue());
        System.out.println(map);

    }
}
