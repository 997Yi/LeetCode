package easy;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 */
public class Day_022 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode n1, TreeNode n2){
//        if (n1 == null && n2 ==null){
//            return true;
//        }
//        if (n1 == null || n2 == null){
//            return false;
//        }
//        return n1.val == n2.val && check(n1.right, n2.left) && check(n1.left, n2.right);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(n1);
        q.offer(n2);
        while(!q.isEmpty()){
            n1 = q.poll();
            n2 = q.poll();
            if (n1 == null && n2 == null){
                continue;
            }
            if (n1 == null || n2 == null || n1.val != n2.val){
                return false;
            }

            q.offer(n1.left);
            q.offer(n2.right);

            q.offer(n1.right);
            q.offer(n2.left);
        }
        return true;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}



