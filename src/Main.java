public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer>alm = new MyArrayList();
        System.out.println(alm.size());//checking the size of arraylist
        alm.add(1);//adding elements to arraylist
        alm.add(2);
        alm.add(3);
        alm.add(4);
        alm.add(5);
        System.out.println(alm.size());//checking the size of arraylist
        System.out.println(alm.get(3));//getting data of index 3
        System.out.println(alm.remove(2));//removing element of index 2 from array
        System.out.println(alm.size());//checking the size of arraylist
        System.out.println(alm.indexOf(1));//checking first occurrence
        System.out.println(alm.lastIndexOf(1));//checking last occurrence
        System.out.println("End of  using ArrayList");

        MyLinkedList<String> ll = new MyLinkedList<>();
        System.out.println(ll.size());//checking the size of linkedlist
        ll.add("Real Madrid");
        ll.add("Barcelona");
        ll.add("PSG");
        ll.add("Napoli");
        ll.add("Irtysh");
        System.out.println(ll.get(0));//getting data of index 0
        System.out.println(ll.remove(3));//removing element of index 3 from linkedlist
        System.out.println(ll.size());//checking the size of linkedlist
        System.out.println("End of  using LinkedList");
    }
}

