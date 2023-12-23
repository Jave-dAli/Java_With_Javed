package HashTables.Implementation;

import HashTables.HashMap;

import java.util.Map;
import java.util.Scanner;

// A program that counts words in a document, printing the most frequent.
public class WordCount {
    public static void main(String[] args) {
        Map<String, Integer> freq=new java.util.HashMap<>();
        Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
        while(doc.hasNext()){
            String word = doc.next().toLowerCase();
            Integer count = freq.get(word);
            if(count == null)
                count = 0;
            freq.put(word, 1+count);
        }
        int maxCount = 0;
        String maxWord = "no word";
//        for(Entry<String, Integer> ent : freq.entrySet())
//            if(ent.getValue() > maxCount){
//                maxWord = ent.getKey();
//                maxCount = ent.getValue();
//            }
        for(var ent : freq.entrySet()){
            if(ent.getValue() > maxCount){
                maxWord = ent.getKey();
                maxCount = ent.getValue();
            }
        }
        System.out.print("The most frequent word is '"+maxWord);
        System.out.println("' with "+maxCount+" occurrences");
    }
}
