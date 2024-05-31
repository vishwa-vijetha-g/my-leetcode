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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        boolean zigZag = false;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> curr = new ArrayList<>();
            int qSize = q.size();
            for(int i=0;i<qSize;i++){
                TreeNode currNode = q.remove();
                curr.add(currNode.val);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            if(zigZag){
                Collections.reverse(curr);
                zigZag = false;
            }else{
                zigZag = true;
            }
            ans.add(curr);
        }

        return ans;
    }
}