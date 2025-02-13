import java.util.*;

public class CustomHashMap<K, V>{
    private static final int DEFAULT_CAPACITY = 16;
    private List<LinkedList<Entry<K, V>>> buckets;

    public CustomHashMap(){
        buckets = new ArrayList<>(DEFAULT_CAPACITY);
        for(int i = 0; i < DEFAULT_CAPACITY; i++){
            buckets.add(new LinkedList<>());
        }
    }

    private int getIndex(K key){
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }

    public void put(K key, V value){
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        for(Entry<K, V> entry : bucket){
            if(entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public V get(K key){
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        for(Entry<K, V> entry : bucket){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        bucket.removeIf(entry -> entry.key.equals(key));
    }

    private static class Entry<K, V>{
        K key;
        V value;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args){
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        System.out.println("Value for 'banana': " + map.get("banana"));
        map.remove("banana");
        System.out.println("Value for 'banana' after removal: " + map.get("banana"));
    }
}
