public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer>alm = new MyArrayList();
        System.out.println(alm.size());
        alm.add(1);
        alm.add(2);
        alm.add(3);
        alm.add(4);
        alm.add(5);
        System.out.println(alm.size());
        System.out.println(alm.get(3));
        System.out.println(alm.remove(2));
        System.out.println(alm.size());
        System.out.println(alm.indexOf(1));
        System.out.println(alm.lastIndexOf(1));
        System.out.println("End of  using ArrayList");

        MyLinkedList<String> ll = new MyLinkedList<>();
        ll.add("Real Madrid");
        ll.add("Barcelona");
        ll.add("PSG");
        ll.add("Napoli");
        ll.add("Irtysh");
        System.out.println(ll.get(0));
        System.out.println(ll.remove(3));
        System.out.println(ll.size());
    }
}

