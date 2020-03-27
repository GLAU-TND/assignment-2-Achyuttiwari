/*
 *  Created by IntelliJ IDEA.
 *  User: Achyuttiwari
 *  Date: 27-Mar-20
 *  Time: 8:59 PM
 */
package problem1.mybst;
import java.util.ArrayList;
import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode root;
    private ArrayList<Integer> arrayList;

    public MyBinarySearchTree() {
        arrayList = new ArrayList<>();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


}
