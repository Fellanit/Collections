package Modul_9.MyHashMap;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private Node<K, V>[] HashMap;
    private int size = 0;
    private int capacity = 16;


    public MyHashMap() {
        HashMap = new Node[capacity];
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

    public void put(K key, V value) {
        int hash = hash(key);
        Node<K, V> newHashMap = new Node<K, V>(key, value, null);
        if (HashMap[hash] == null) {
            HashMap[hash] = newHashMap;
        } else {
            Node<K, V> prev = null;
            Node<K, V> current = HashMap[hash];


            while (current != null) {
                if (current.key.equals(key)) {
                    if (prev == null) {
                        newHashMap.next = current.next;
                        HashMap[hash] = newHashMap;
                        return;
                    } else {
                        newHashMap.next = current.next;
                        prev.next = newHashMap;
                        return;
                    }
                }
                prev = current;
                prev.next = newHashMap;
                return;
            }
            prev.next = newHashMap;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        if (HashMap[hash] == null) {
            return null;
        } else {
            Node<K, V> temp = HashMap[hash];
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
        if (HashMap[hash] == null) {
            return false;
        } else {
            Node<K, V> prev = null;
            Node<K, V> current = HashMap[hash];

            while (current != null) {
                if (current.key.equals(removeKey)) {
                    if (prev == null) {
                        HashMap[hash] = HashMap[hash].next;
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
            if (HashMap[i] != null) {
                Node<K, V> node = HashMap[i];

                while (node != null) {
                    System.out.println("{" + node.key + " = " + node.value + "}" + " ");
                    node = node.next;
                }
            }
        }
    }

    private int hash(Node<K, V> node) {
        return node.hashCode() % HashMap.length;
    }

    private int hash(final K key) {
        int hash = 31;
        hash = hash * 17 + key.hashCode();
        return hash % HashMap.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;
        return size == myHashMap.size && capacity == myHashMap.capacity && Arrays.equals(HashMap, myHashMap.HashMap);
    }

}

