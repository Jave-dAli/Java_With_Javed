package HashTables;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    static char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> map=new HashMap<>();
        var chars=str.toCharArray();

        for(var ch:chars){
            var count=map.containsKey(ch)?map.get(ch):0;
            map.put(ch, count+1);
        }

        for(var ch:chars)
            if(map.get(ch)==1)
                return ch;
        return Character.MIN_VALUE;
    }
    public static void main(String[] args) {
        String str="programming is programming";
        var ch=findFirstNonRepeatingChar(str);
        System.out.println(ch);

    }
}
