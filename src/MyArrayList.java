public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        Object[] arrayElements = new Object[DEFAULT_CAPACITY];
        int size = 0;
    }

    public void clear() {
        Object[] arrayElements = new Object[DEFAULT_CAPACITY];
        int size = 0;
    }

    private Object[] grow(int size) {
        return grow(size + 1);
    }

    public int size() {
        return this.size();
    }

    private void add(E e, Object[] array, int s) {
        if (s < array.length) {
            array[s] = e;
            array = grow(size());
        } else if (s == array.length) {
            int i = 0;
            array = new Object[array.length * 2];
            for (Object d : array) {
                i++;
                array[i] = d;
            }
            array[s] = e;
            array = grow(size());
        }

        System.out.println("array = " + array);
    }


}