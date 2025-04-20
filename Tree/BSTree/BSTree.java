package Tree.BSTree;

import Tree.Tree;

public class BSTree extends Tree {
    private Node root;
    private int size;
    private int depth;

    public BSTree() {
        this.root = null;
        this.size = 0;
        this.depth = 0;
    }

    public boolean search(int value) {
        return searchRec(this.root, value);
    }

    public boolean searchRec(Node root, int value) {
        if (root == null) return false;

        if (root.data == value) return true;

        if (value < root.data) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    public void insert(int value) {
        this.root = insertRec(this.root, value);
        size++;
    }

    public Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void delete(int value) {
        this.root = deleteRec(this.root, value);
    }

    public Node deleteRec(Node root, int value) {
        if (root == null) return root;

        if (value < root.data) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.data){
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left != null && root.right == null) {
                root = root.left;
            } else if (root.left == null && root.right != null) {
                root = root.right;
            } else {
                root.data = successor(root.right);
                root.right = deleteRec(root.right, root.data);
            }
        }

        return root;
    }

    public int successor(Node root) {
        int successorData = root.data;
        while (root.left != null) {
            successorData = root.left.data;
            root = root.left;
        }
        return successorData;
    }

    public int depth() { return depth; }
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; };

    public void preOrder() {
        preOrderRec(this.root);
        System.out.println();
    }

    public void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");

            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void inOrder() {
        inOrderRec(this.root);
        System.out.println();
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(this.root);
        System.out.println();
    }

    public void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void levelOrder() {
        int height = height(this.root);
        for (int i = 1; i <= height; i++) {
            levelOrderRec(this.root, i);
        }
        System.out.println();
    }

    public void levelOrderRec(Node root, int level) {
        if (root != null) {
            if (level == 1) {
                System.out.print(root.data + " ");
            } else {
                levelOrderRec(root.left, level - 1);
                levelOrderRec(root.right, level - 1);
            }
        }
    }

    public int height(Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
    }
}
