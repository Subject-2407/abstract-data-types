package Stack.DynamicStack;

import List.ArrayList.ArrayList;
import Stack.Stack;

public class DynamicStack extends Stack {
    private ArrayList arrayList;
    private int top;

    public DynamicStack() {
        this.arrayList = new ArrayList();
        this.top = -1;
    }

    public void push(int value) {
        arrayList.insert(value);
        top++;
    }

    public int pop() {
        if (arrayList.size() == 0) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int value = arrayList.get(top);
        arrayList.remove(top);
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arrayList.get(top);
    }

    public int size() { return top + 1; }
    public boolean isEmpty() { return top == -1; }
}
