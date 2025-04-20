import List.List;
import List.ArrayList.ArrayList;
import List.LinkedList.LinkedList;
import Queue.*;
import Set.*;
import Stack.*;
import Tree.*;
import Tree.BSTree.BSTree;


public class Main {
    public static void main(String[] args) {
        Tree bTree = new BSTree();

        bTree.insert(25);
        bTree.insert(24);
        bTree.insert(31);
        bTree.insert(44);
        bTree.insert(66);
        bTree.insert(90);
        bTree.insert(15);
        bTree.insert(50);
        bTree.insert(10);
        bTree.insert(22);
        bTree.insert(35);
        bTree.insert(70);
        bTree.insert(4);
        bTree.insert(12);
        bTree.insert(18);
        System.out.print("Pre Order (DFS) : "); bTree.preOrder();
        System.out.print("In Order (DFS) : "); bTree.inOrder();
        System.out.print("Post Order (DFS) : "); bTree.postOrder();
        System.out.print("Level Order (BFS) : "); bTree.levelOrder();
        System.out.println("Does 10 exists in this tree? : " + (bTree.search(10) ? "Yes it does." : "No it does not."));

    }
}
