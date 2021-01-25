/*
 *  Created by IntelliJ IDEA.
 *  User: Achyuttiwari
 *  Date: 27-Mar-20
 *  Time: 10:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.println("Enter number of nodes");/*-->*/
        int n = scanner.nextInt();
        while (n-- > 0) {
            System.out.println("Enter data");/*-->*/
            int val = scanner.nextInt();
            TreeNode node = new TreeNode();
            node.setData(val);
            bst.insert(node);
        }

        System.out.println(bst.showLeft(bst.getRoot(), false));
    }

}
