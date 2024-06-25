package HashMapInternalDesign;

public class MyHashMap<K, V> {
    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    @SuppressWarnings("rawtypes")
    public Entry[] hashTable;

    public MyHashMap() {
        this.hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n < 0 ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if (node == null) {
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>(7);
        myHashMap.put(1, "hi");
        myHashMap.put(2, "Pankaj");
        myHashMap.put(3, "Agrawal");
        myHashMap.put(4, "GLA");
        myHashMap.put(5, "SDE1");
        myHashMap.put(6, "SDE2");
        myHashMap.put(7, "Cognizant");
        myHashMap.put(8, "Zoho");
        myHashMap.put(9, "Flipkart");
        myHashMap.put(10, "Google");

        String value = myHashMap.get(10);
        System.out.println(value);
    }
}
