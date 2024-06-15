/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        leftRightDepth(root);
        return diameter;
    }

    public int leftRightDepth(TreeNode root){
        if(root==null) return 0;
        int l = leftRightDepth(root.left);
        int r = leftRightDepth(root.right);
        diameter = Math.max(diameter,l+r);
        return Math.max(l,r)+1;
    }
}