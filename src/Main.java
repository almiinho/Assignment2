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
    }
}

