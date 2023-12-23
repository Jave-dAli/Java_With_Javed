package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DefangIP {
    public String defangIPaddr(String address){
        return address.replace(".", "[.]");
    }
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length(); i++){
            if(jewels.contains(String.valueOf(stones.charAt(i))))
                count++;
        }
        return count;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        String str = "";
        for(int i=0; i<words.length; i++){
            if(words[i].contains(String.valueOf(x)))
                str = str + i+".";
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            list.add(Character.getNumericValue(str.charAt(i)));
        }
        return list;
    }

    public static void main(String[] args) {
        DefangIP defang = new DefangIP();
        System.out.println(defang.numJewelsInStones("aAA", "aAAABBB"));
    }
}
