package ph.edu.dlsu.ADT;


public interface MyStack {

    void createStack();

    /**
     * Insert a new item into the stack.
     */
    void push(double x);

    /**
     * Remove the most recently inserted item from the stack.
     */
    void pop();

    /**
     * Get the most recently inserted item in the stack. * Does not alter
     * the stack.
     */
    double peek();

    /**
     * Test if the stack is logically empty..
     */
    boolean isEmpty();

    public int size();
}
