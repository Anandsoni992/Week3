package hashmapandhasfunctions.customhashmap;

import java.util.LinkedList;

class CustomHashMap {
    static final int SIZE = 100;
    LinkedList<Entry>[] table;

    // Constructor
    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Inner class for key-value pair
    class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert key-value pair
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        for (Entry entry : list) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        list.add(new Entry(key, value));
    }

    // Retrieve value by key
    public int get(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        for (Entry entry : list) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return -1;  // Not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        list.removeIf(entry -> entry.key == key);
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 100);
        map.put(2, 200);
        System.out.println(map.get(1));  // 100
        map.remove(1);
        System.out.println(map.get(1));  // -1
    }
}
