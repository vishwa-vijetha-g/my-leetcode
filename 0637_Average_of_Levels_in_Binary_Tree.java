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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans = new ArrayList<>();
        
        if(root==null){
            return ans;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(q.size()>0){
            
            double sum = 0;
            int count = 0;
            int qSize = q.size();
           
            while(qSize>0){
                
                TreeNode curr = q.remove();
                sum = sum + curr.val;
                count++;

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
                
                qSize--;

            }

            ans.add(sum/count);
        }

        return ans;

    }
}