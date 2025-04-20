package Queue.StaticQueue;

import Queue.Queue;

public class StaticQueue extends Queue {
    private int[] collection;
    private int front;
    private int rear;

    public StaticQueue(int length) {
        this.collection = new int[length];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else { rear = (rear + 1) % collection.length; }

        collection[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int value = peek();
        
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % collection.length;
        }
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return collection[front];
    }

    public boolean isFull() { return size == collection.length; }
}
