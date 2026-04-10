package DSA.nonlinear.trees.binaryTrees.traversals.bfs;
import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree {
    public static void BFS(TreeNode root) {
        // base case // corner case // edge case
        if (root == null) {
            return;
        }
        // we are pushing nodes into the queue hence we are using queue dta structure
        Queue<TreeNode> queue = new LinkedList<>();
        // add the root node into the queue and then traverse left and right
        queue.add(root);
        // print all nodes level by level till the queue is empty
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll(); // removes and stores the front node
            System.out.println(temp.data + " ");
            // left subtree
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("BFS TRAVERSAL:");
        BFS(root);
    }
}


