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

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer> path = new ArrayList<>();
        dfs(root,path,targetSum);
        return ans;
    }

    public void dfs(TreeNode node, List<Integer> path, int targetSum){
        if(node==null) return;

        path.add(node.val);
        
        if(node.left==null && node.right==null && targetSum - node.val == 0)
            ans.add(new ArrayList<>(path));
        
        dfs(node.left,path,targetSum - node.val);
        dfs(node.right,path,targetSum - node.val);

        path.remove(path.size()-1);
    }
}