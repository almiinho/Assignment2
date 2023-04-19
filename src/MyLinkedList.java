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

    public void add(E element) {
        node node2 = new node(element, null, tail);
        if (head == null) {
            head = tail = node2;
        } else {
            tail.next = node2;
            tail = node2;
        }

        size++;

    }

    public E get(int index) {
        node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;

        }

        return current.element;
    }

    public E remove(int index){
        node current=head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

        return current.element;
    }
}

