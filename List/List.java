package List;

abstract public class List {
    protected int size;

    public List() {
        size = 0;
    }

    public int size() { return size; }

    public abstract int get(int index);
    public abstract int search(int value);
    public abstract void insert(int value);
    public abstract void set(int index, int value);
    public abstract int remove(int index);
}
