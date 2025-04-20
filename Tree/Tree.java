package Tree;

public abstract class Tree {
    public abstract boolean search(int value);
    public abstract void insert(int value);
    public abstract void delete(int value);
    // public abstract int depth();
    // public abstract int size();
    // public abstract boolean isEmpty();
    public abstract void preOrder();
    public abstract void inOrder();
    public abstract void postOrder();
    public abstract void levelOrder();
}
