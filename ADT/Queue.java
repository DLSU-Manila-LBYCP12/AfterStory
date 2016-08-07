package ph.edu.dlsu.ADT;

/**
 * Created by Jacob on 8/7/2016.
 */
public class Queue<E> implements MyQueue<E> {
    // constants
    public static final int MAX_LIST = 4430;

    // instance variables
    private E[] data; // generic array used for storage
    private int front = 0; // index of the front element
    private int sz = 0; // current number of elements
    private int back = MAX_LIST - 1;

    public Queue() { // constructs queue with default MAX_LIST capacity
        this(MAX_LIST);
    }

    public Queue(final int capacity) { // constructs queue with given capacity
        data = (E[]) new Object[capacity];
    }

    // methods
    //Returns the number of elements in the queue. âˆ—/
    public int size() {
        return sz;
    }

    //âˆ—âˆ— Tests whether the queue is empty. âˆ—/
    public boolean isEmpty() {
        return (sz == 0);
    }

    public boolean isFull() {
        return (sz == MAX_LIST);
    }
    //âˆ—âˆ— Inserts an element at the rear of the queue. âˆ—/


    public void enQueue(E e) throws IllegalStateException {
        if (isFull()) throw new IllegalStateException("Queue is full");
        back = (front + sz) % MAX_LIST; // use modular arithmetic
        data[back] = e;
        sz++;
    }

    public E front() {
        return data[front];
    }

    public int first() {
        return front;
    }

    public E rear() {
        return data[back];
    }

    public int last() {
        return back + 1;
    }

    public void deQueue() {
        if (!isEmpty()) {
            sz--;
            front = (front + 1) % MAX_LIST;
        }
    }

    public E get(int I) {

        return data[I];
    }
}

