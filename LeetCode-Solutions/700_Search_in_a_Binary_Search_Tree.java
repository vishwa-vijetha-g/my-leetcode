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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }

        // TreeNode lefty = searchBST(root.left, val);
        // TreeNode righty = searchBST(root.right, val);

        // return lefty!=null? lefty : righty;

        TreeNode node = root.val < val ? root.right : root.left;

        return searchBST(node,val);
   }
}