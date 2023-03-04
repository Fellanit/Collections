package Modul_9.MyHashMap;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private Node<K, V>[] hashMap;
    private int size = 0;
    private Node<K, V> current;
    private int capacity = 16;


    public MyHashMap() {
        hashMap = new Node[capacity];
        size = 0;

    }

    private class Node<K, V> {

        private int hash;
        private K key;
        private V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;

        }

        @Override
        public int hashCode() {
            int hash = 31;
            hash = hash * 17 + key.hashCode();
            hash = hash * 17 + value.hashCode();
            return hash;
        }
    }

    public int size() {
        return size;
    }

    public void put(K key, V value){

        if (size == 0) {
            current = new Node<>(key, value, null);
            size++;
        } else {
            Node<K, V> temp = current;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            temp.next = new Node<>(key, value, null);
            size++;
        }
    }


    public V get(K key) {
        int hash = hash(key);
        if (hashMap[hash] == null) {
            return null;
        } else {
            Node<K, V> temp = hashMap[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }

    }

    public boolean remove(K removeKey) {
        int hash = hash(removeKey);
        if (hashMap[hash] == null) {
            return false;
        } else {
            Node<K, V> prev = null;
            Node<K, V> current = hashMap[hash];

            while (current != null) {
                if (current.key.equals(removeKey)) {
                    if (prev == null) {
                        hashMap[hash] = hashMap[hash].next;
                        size--;
                        return true;
                    }
                }
                prev = current;
                current = current.next;
            }
            return false;
        }

    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (hashMap[i] != null) {
                Node<K, V> node = hashMap[i];

                while (node != null) {
                    System.out.println("{" + node.key + " = " + node.value + "}" + " ");
                    node = node.next;
                }
            }
        }
    }

    private int hash(Node<K, V> node) {
        return node.hashCode() % hashMap.length;
    }

    private int hash(final K key) {
        int hash = 31;
        hash = hash * 17 + key.hashCode();
        return hash % hashMap.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;
        return size == myHashMap.size && capacity == myHashMap.capacity && Arrays.equals(hashMap, myHashMap.hashMap);
    }

}

