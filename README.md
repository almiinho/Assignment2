# Assignment2
private Object[] array : This is the underlying array that stores the elements of the ArrayList. 

private int size = 0 : This variable keeps track of the current number of elements in the ArrayList.

private int capacity = 5 : This variable represents the initial capacity of the ArrayList. If the number of elements exceeds the capacity, the array is resized using the Increasearray() method.

public MyArrayList()  : This is the constructor for the MyArrayList class, which initializes the array with the initial capacity.

public int size() : This method returns the number of elements in the ArrayList.

public void add(G item)  : This method adds an element to the ArrayList. If the size of the ArrayList is equal to its capacity, the Increasearray() method is called to double its capacity.

private void Increasearray()  : This method doubles the capacity of the ArrayList and copies the elements from the old array to the new array.

public G get(int index)  : This method returns the element at the specified index.

public G remove(int index)  : This method removes the element at the specified index and returns it. It shifts all the subsequent elements to the left by one index to fill the gap created by the removal.

public int indexOf(Integer a)  : This method returns the index of the first occurrence of the specified element in the ArrayList. If the element is not found, it returns -1.

public int lastIndexOf(Integer a)  : This method returns the index of the last occurrence of the specified element in the ArrayList. If the element is not found, it returns -1.
