package HashDidi;

import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        // Constructor
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();    // should be in bw 0 - N-1
            return Math.abs(bi) % N;    // use % to get value in bw 0 and N
        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key)
                    return i;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBuckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                 for(int j=0; j<ll.size(); j++){
                     Node node = ll.get(j);
                     put(node.key, node.value);
                 }
            }
        }
        public void put(K key, V value){        // Avg: O(lambda) Worst: O(n)
            int bi = hashFunction(key);
            int di = searchInLL(key,  bi);  // di = data idx

            if(di == -1)
                buckets[bi].add(new Node(key, value));
            else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2)
                rehash();
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,  bi);  // di = data idx

            if(di == -1)
                return false;
            else {
                return true;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,  bi);  // di = data idx

            if(di == -1)
                return null;
            else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,  bi);  // di = data idx

            if(di == -1)
                return null;
            else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("India", 190);
            map.put("China", 200);
            map.put("US", 50);

            ArrayList<String> keys = map.keySet();
            for(int i=0; i<keys.size(); i++){
                System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
            }
            map.remove("India");
            System.out.println(map.get("India"));
        }
    }
}
