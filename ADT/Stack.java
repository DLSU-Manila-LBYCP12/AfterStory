package ph.edu.dlsu.ADT;

public class Stack implements MyStack {

    private double[] Array;
    private int tos;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Construct the stack.
     */
    public void createStack() {
        Array = new double[DEFAULT_CAPACITY];
        tos = -1;
        size = 0;
    }


    public boolean isEmpty() {
        return tos == -1;
    }


    public void makeEmpty() {
        tos = -1;
        size = 0;
    }


    public double peek() {
        if (isEmpty()) {
            throw new UnderflowException("ArrayStack top");
        }
        return  Array[tos];
    }


    public void pop() {

        if (isEmpty()) {
            throw new UnderflowException("ArrayStack pop");
        }
        tos--;
        size--;
    }


    /**
     * Insert a new item into the stack.
     */
    public void push(double x) {
        if (tos + 1 == Array.length) {
        }
        Array[ ++tos] = x;
        size++;
    }

    /**
     * Internal method to extend theArray.
     */
    // private void doubleArray() {
    double[] newArray;

    //newArray = new double[Array.length * 2];
    //for (double i = 0; i < Array.length; i++) {
    // newArray[i] = Array[i];
    // }
    // Array = newArray;
    // }

    public int size(){
        return tos+1;
    }
}