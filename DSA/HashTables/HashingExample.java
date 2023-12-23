package HashTables;

import java.util.HashMap;

public class HashingExample {

    public static void main(String[] args) {
        // Creating a HashMap for demonstration
        HashMap<String, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");

        // Displaying the original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Example of hashing using hashCode()
        String keyToHash = "key1";
        int hashValue = keyToHash.hashCode();
        System.out.println("Hash code of '" + keyToHash + "': " + hashValue);

        // Example of using a custom hash function
        String customKeyToHash = "customKey";
        int customHashValue = customHashFunction(customKeyToHash);
        System.out.println("Custom hash code of '" + customKeyToHash + "': " + customHashValue);
    }

    // Custom hash function example
    private static int customHashFunction(String input) {
        // Simple custom hash function: sum ASCII values of characters
        int hash = 0;
        for (char c : input.toCharArray()) {
            hash += (int) c;
            int asci = 'a';
        }
        return hash;
    }
}
