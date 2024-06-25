package HashMapInternalDesign;

public class Entry<K, V> {
    public K key;
    public V value;
    @SuppressWarnings("rawtypes")
    public Entry next;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }
}
