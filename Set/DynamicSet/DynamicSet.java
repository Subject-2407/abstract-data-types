package Set.DynamicSet;

import List.List;
import List.ArrayList.ArrayList;
import Set.Set;

public class DynamicSet extends Set {
    private List collection;

    public DynamicSet() {
        this.collection = new ArrayList();
    }

    public void insert(int value) {
        if (!contains(value)) {
            collection.insert(value);
        }
    }

    public void remove(int value) {
        if (isEmpty()) {
            System.out.println("Set is empty!");
            return;
        }

        int index = collection.search(value);
        if (index != -1) collection.remove(index);
    }

    public boolean contains(int value) { return collection.search(value) != -1; }
    public int size() { return collection.size(); }
    public boolean isEmpty() { return collection.size() == 0; }

    @Override
    public String toString() {
        return collection.toString();
    }
}
