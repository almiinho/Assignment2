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
}
