package List.LinkedList;

import List.List;

public class LinkedList extends List {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }

        if (index == size - 1) { return tail.value; }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int getFirst() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return -1;
        }
        return head.value;
    }

    public int getLast() {
        if (tail == null) {
            System.out.println("Linked list is empty!");
            return -1;
        }
        return tail.value;
    }

    public int search(int value) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) return i;
            temp = temp.next;
        }

        return -1;
    }

    public void insert(int value) {
        insertAt(0, value);
    }

    public void insertAt(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            Node temp = head;
            head = new Node(value);
            head.next = temp;
            if (tail == null) tail = head;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node after = temp.next;
            temp.next = new Node(value);
            temp.next.next = after;
        }
        size++;
    }

    public void insertLast(int value) {
        if (head == null && tail == null) {
            head = tail = new Node(value);
        } else {
            Node vertex = new Node(value);
            tail.next = vertex;
            tail = vertex;
        }
        size++;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == size - 1) { tail.value = value; return; }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public int remove(int index) {
        int value = -1;
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return value;
        }

        if (index == 0) {
            value = head.value;
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            value = temp.next.value;
            temp.next = temp.next.next;
            if (temp.next == null) { tail = temp; }
        }
        size--;
        return value;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return -1;
        }

        int value = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return value;
    }

    public int removeLast() {
        int value = -1;
        if (head == null) {
            System.out.println("Linked list is empty!");
            return value;
        }

        if (head.next == null) {
            value = head.value;
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            value = temp.next.value;
            temp.next = null;
            tail = temp;
        }
        size--;
        return value;
    }

    @Override
    public String toString() {
        String listString = "";

        Node temp = head;
        while (temp != null) {
            listString += temp.value;
            temp = temp.next;
            if (temp != null) listString += " -> ";
        }

        return listString;
    }
}
