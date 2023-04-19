

public class MyArrayList<G> {//creating generic MyArrayList

    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {//creating own class
        array = new Object[capacity];
    }
    public int size() { //checking the size of arraylist
        return size;
    }

    public void add(G item) {   // adding element into arraylist
        if (size == capacity) {
            Increasearray();
        }
        array[size++] = item;
    }

    private void Increasearray() {  // increasing size of an arraylist
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
    public int indexOf(Integer a) { //checking first occurrence
        for (int i = 0; i < size; i++) {
            if (a.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(Integer a) {//checking last occurrence
        for (int i = size - 1; i >= 0; i--) {
            if (a.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
}








