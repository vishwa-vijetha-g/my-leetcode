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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<>();
        dfs(root,nodes);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nodes.size()-1;i++){
            ans = Math.min(ans, Math.abs(nodes.get(i)-nodes.get(i+1)));
        }

        return ans;

    }

    public void dfs(TreeNode root, ArrayList<Integer> nodes){
        if(root==null){
            return ;
        }
        
        dfs(root.left, nodes);
        nodes.add(root.val);
        dfs(root.right, nodes);
    }
}