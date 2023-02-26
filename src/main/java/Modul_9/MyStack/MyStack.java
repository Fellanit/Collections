package Modul_9.MyStack;

import java.util.Arrays;
import java.util.Objects;

public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    Object[] arrayElements;
    int size;
    int index;


    public MyStack() {
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
        for (Object elements : arrayElements) {
            if (elements != null) {
                sb.append(elements).append(",");
            }
        }
        return sb.toString().substring(0, sb.length() - 1);
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

    public void push(E e) {
        arrayElements = Arrays.copyOf(arrayElements, arrayElements.length + 1);
        arrayElements[size] = e;
        size++;
    }

    public Object peek() {
        return arrayElements[size - 1];
    }

        public E  pop(){
            E element = (E) arrayElements[size-1];
            arrayElements = Arrays.copyOf(arrayElements, size - 1);
            size--;
            return element;
        }

}


