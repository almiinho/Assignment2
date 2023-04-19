import java.util.Arrays;

public class MyArrayList<G> {
    public Object add;
    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {//creating own class
        array = new Object[capacity];
    }
    public int size() { //checking the size of array
        return size;
    }

    public void add(G item) {   // adding element into array
        if (size == capacity) {
            Increasearray();
        }
        array[size++] = item;
    }

    private void Increasearray() {  // increasing size of an array
        capacity = (int) (2 * capacity);
        Object[] newarr = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newarr[i] = array[i];
        }
        array = newarr;
    }


    public G get(int index) {  // accessing data
        return (G) array[index];
    }

    public G remove(int index) { // removing data

        G removeditem = (G) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removeditem;
    }
    public int indexOf(Integer a) { //
        for (int i = 0; i < size; i++) {
            if (a.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(Integer a) {
        for (int i = size - 1; i >= 0; i--) {
            if (a.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
}








