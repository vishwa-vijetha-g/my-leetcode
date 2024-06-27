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
    
    HashMap<Long,Integer> hm = new HashMap();
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return count;
        hm.put(0L,1);
        dfs(root,0,targetSum);

        return count;
    }

    public void dfs(TreeNode root, long currentSum, int targetSum){

        if(root == null)
            return ;

        currentSum += root.val;

        if(hm.containsKey(currentSum - targetSum)){
            count += hm.get(currentSum - targetSum);
        }

        hm.put(currentSum,hm.getOrDefault(currentSum,0)+1);

        dfs(root.left, currentSum, targetSum);
        dfs(root.right, currentSum, targetSum);

        hm.put(currentSum,hm.get(currentSum)-1);


    }
}