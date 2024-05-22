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


    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depth = 0;

        ArrayDeque<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            depth++;
            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            
        }

        return depth;

    }
}