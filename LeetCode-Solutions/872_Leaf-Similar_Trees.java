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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> root1Leaves = new ArrayList<>();
        ArrayList<Integer> root2Leaves = new ArrayList<>();

        addLeaves(root1,root1Leaves);
        addLeaves(root2,root2Leaves);

        return root1Leaves.equals(root2Leaves);
    }

    public void addLeaves(TreeNode root, ArrayList<Integer> rootleaves){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            rootleaves.add(root.val);
            return ;
        }
        addLeaves(root.left, rootleaves);
        addLeaves(root.right, rootleaves);
        

    }
}