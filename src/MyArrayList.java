import java.util.Arrays;

public class MyArrayList<G> {
    public Object add;
    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        array = new Object[capacity];
    }

    public void add(G item) {
        if (size == capacity) {
            Increasearray();
        }
        array[size++] = item;
    }

    private void Increasearray() {
        capacity = (int) (2 * capacity);
        Object[] newarr = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newarr[i] = array[i];
        }
        array = newarr;
    }

    public int size() {
        return size;
    }

    public G get(int index) {
        return (G) array[index];
    }

    public G remove(int index) {

        G removeditem = (G) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removeditem;
    }
    public int indexOf(Object a) {
        for (int i = 0; i < size; i++) {
            if (a.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
}








