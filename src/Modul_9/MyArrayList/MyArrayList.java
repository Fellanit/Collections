package Modul_9.MyArrayList;

import java.util.Objects;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    Object[] arrayElements;
    int size;
    int index;


    public MyArrayList() {
        arrayElements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void clear() {
        Object[] arrayElements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(Object elements: arrayElements){
            if(elements!= null){
                sb.append(elements).append(",");
            }
        }
        return sb.toString().substring(0,sb.length() - 1);
    }


    public E remove(int index) {
        Objects.checkIndex(index, size);
        if (index <= size) {
            E e = (E) arrayElements[index];
            System.arraycopy(arrayElements, index + 1, arrayElements, index, size - index - 1);
            size--;
            this.index = index;
            return e;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        E e = (E) arrayElements[index];
        this.index = index;
        return e;
    }

    public void add(E value) {
        if (size == arrayElements.length) {
            Object[] newArray = new Object[arrayElements.length * 2];
            System.arraycopy(arrayElements, 0, newArray, 0, arrayElements.length);
            arrayElements = newArray;

        }


        arrayElements[size++] = value;
    }
    //    public E get(int index) {
//        if (index <= size) {
//            E e = (E) arrayElements[index];
//            return e;
//        } else {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//    }
//}
}
