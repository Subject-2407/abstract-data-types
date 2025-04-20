package List.ArrayList;

import List.List;

public class ArrayList extends List {
    private int[] collection;

    public ArrayList() {
        this.collection = new int[16];
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return collection[index];
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (collection[i] == value) return i;
        }
        
        return -1;
    }

    public void insert(int value) {
        if (size == collection.length) {
            int[] newArr = new int[collection.length * 2];
            for (int i = 0; i < collection.length; i++) {
                newArr[i] = collection[i];
            }
            collection = newArr;
        }

        collection[size] = value;
        size++;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        collection[index] = value;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }

        int value = collection[index];
        for (int i = index; i < size - 1; i++) {
            collection[i] = collection[i + 1];
        }
        size--;
        return value;
    }

    @Override
    public String toString() {
        String listString = "[";
        for (int i = 0; i < size; i++) {
            listString += collection[i];
            if (i != size - 1) listString += ", ";
        }
        listString += "]";

        return listString;
    }
}
