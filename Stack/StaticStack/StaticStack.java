package Stack.StaticStack;

import Stack.Stack;

public class StaticStack extends Stack {
    private int[] collection;
    private int top;

    public StaticStack(int length) {
        this.collection = new int[length];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        collection[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return collection[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return collection[top];
    }

    public int size() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top + 1;
    }

    public boolean isFull() { return top == collection.length - 1; }
    public boolean isEmpty() { return top == -1; }
}