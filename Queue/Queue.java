package Queue;

public abstract class Queue {
    protected int size;

    public Queue() {
        size = 0;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public abstract void enqueue(int value);
    public abstract int dequeue();
    public abstract int peek();
}
