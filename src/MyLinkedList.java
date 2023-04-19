public class MyLinkedList<E> {
    private class node {
        E element;
        node next;
        node previous;

        public node(E element, node previous, node next) {
            this.element = element;
            this.previous = previous;
            this.next = next;

        }
    }
    private node head;
    private node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean add(E element) {
        node node2 = new node(element, null, tail);
        if (size == 0) {
            head = node2;
        } else {
            tail.next = node2;
        }
        tail = node2;
        size++;
        return true;
    }
    public E get(int index) {
        node present;
        if (index < size / 2) {
            present = head;
            for (int i = 0; i < index; i++) {
                present = present.next;
            }
        } else {
            present = tail;
            for (int i = size - 1; i > index; i--) {
                present = present.previous;
            }
        }

        return present.element;
    }
}

