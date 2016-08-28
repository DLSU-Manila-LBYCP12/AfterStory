package ph.edu.dlsu.ADT;

public interface MyQueue<E> {

    void enQueue(E e);

    void deQueue();

    boolean isEmpty();

    int size();

    E front();

    E rear();

    int first();

    int last();

    E get(int I);

    boolean isFull();
}
