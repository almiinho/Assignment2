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
}
