class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        if(root==null) return ans;

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        
        int qSize;
        TreeNode curr;

        q.add(root);
        
        while(!q.isEmpty()){
            
            qSize = q.size();
            
            for(int i=0;i<qSize;i++){
                
                curr = q.remove();
                
                if(i==qSize-1)   
                    ans.add(curr.val); //right most node
                
                if(curr.left!=null)
                    q.add(curr.left);
                
                if(curr.right!=null)
                    q.add(curr.right);
            
            }
            
        }

        return ans;
    }
}