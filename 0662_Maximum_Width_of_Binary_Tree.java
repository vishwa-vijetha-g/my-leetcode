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

    class Node{
        TreeNode node;
        int index;
        Node(TreeNode node,int index){
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root,0));
        int max = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int start = 0, end = 0;
            for(int i=0;i<size;i++){
                Node curr = q.remove();
                TreeNode node = curr.node;
                int index = curr.index;
                if(i==0)
                    start = index;
                if(i==size-1)
                    end = index;

                if(node.left!=null)
                    q.add(new Node(node.left,2*index));
                if(node.right!=null)
                    q.add(new Node(node.right,(2*index) + 1));
            }

            max = Math.max(max, end-start+1);
        }

        return max;
    }
}