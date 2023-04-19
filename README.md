# Assignment2
private Object[] array : This is the underlying array that stores the elements of the ArrayList. 

private int size = 0 : This variable keeps track of the current number of elements in the ArrayList.

private int capacity = 5 : This variable represents the initial capacity of the ArrayList. If the number of elements exceeds the capacity, the array is resized using the Increasearray() method.

public MyArrayList()  : This is the constructor for the MyArrayList class, which initializes the array with the initial capacity.

public int size() : This method returns the number of elements in the ArrayList.

public void add()  : This method adds an element to the ArrayList. If the size of the ArrayList is equal to its capacity, the Increasearray() method is called to double its capacity.

private void Increasearray()  : This method doubles the capacity of the ArrayList and copies the elements from the old array to the new array.

public G get()  : This method returns the element at the specified index.

public G remove()  : This method removes the element at the specified index and returns it. It shifts all the subsequent elements to the left by one index to fill the gap created by the removal.

public int indexOf()  : This method returns the index of the first occurrence of the specified element in the ArrayList. If the element is not found, it returns -1.

public int lastIndexOf()  : This method returns the index of the last occurrence of the specified element in the ArrayList. If the element is not found, it returns -1.

MyLinkedList(): a constructor that initializes the head, tail, and size variables to null, null, and 0, respectively.
size(): a method that returns the current size of the linked list.
add(): a method that adds a new element to the end of the linked list.
get(): a method that returns the element at the specified index in the linked list.
remove(): a method that removes the element at the specified index in the linked list.
