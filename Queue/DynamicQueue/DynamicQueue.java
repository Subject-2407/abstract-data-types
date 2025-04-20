package Queue.DynamicQueue;

import List.LinkedList.LinkedList;
import Queue.Queue;

public class DynamicQueue extends Queue {
    private LinkedList linkedList;

    public DynamicQueue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue(int value) {
        linkedList.insertLast(value);
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        size--;
        return linkedList.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return linkedList.getFirst();
    }
}
