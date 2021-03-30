package easy;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明：叶子节点是指没有子节点的节点。
 *
 *
 */
public class Day_027 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        
        int left = 0;
        int right = 0;
        if (root.left != null){
            left = minDepth(root.left);
        }
        if (root.right != null){
            right = minDepth(root.right);
        }

        if (left == 0){
            return right + 1;
        }
        if (right == 0){
            return left + 1;
        }
        return Math.min(left, right) + 1;

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}
