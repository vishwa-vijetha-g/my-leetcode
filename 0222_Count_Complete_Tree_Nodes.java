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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }

        int l = leftDepth(root);
        int r = rightDepth(root);

        if(l==r){
            return (1 << l) - 1; // 2 power left depth minus 1
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int leftDepth(TreeNode root){
        int l = 0;
        while(root!=null){
            l++;
            root = root.left;
        }
        return l;
    }

    public int rightDepth(TreeNode root){
        int r = 0;
        while(root!=null){
            r++;
            root = root.right;
        }
        return r;
    }

}