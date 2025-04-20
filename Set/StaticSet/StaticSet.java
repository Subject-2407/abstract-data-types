package Set.StaticSet;

import Set.Set;

public class StaticSet extends Set {
    private int[] collection;
    private int size;

    public StaticSet(int length) {
        this.collection = new int[length];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == collection.length) {
            System.out.println("Set is full!");
            return;
        }

        if (!contains(value)) {
            collection[size] = value;
            size++;
        }
    }
    
    public void remove(int value) {
        if (isEmpty()) {
            System.out.println("Set is empty!");
            return;
        }

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (collection[i] == value) { index = i; break; }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                collection[i] = collection[i + 1];
            }
            size--;
        }
    }

    public boolean contains(int value) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == value) return true;
        }
        return false;
    }
    
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    @Override
    public String toString() {
        String set = "[";
        for (int i = 0; i < size; i++) {
            set += collection[i];
            if (i != size - 1) set += ", ";
        }
        set += "]";
        return set;
    }
}
