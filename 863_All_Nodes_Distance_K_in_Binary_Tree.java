class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();

        if(root==null) return ans;

        HashMap<TreeNode,TreeNode> childParent = new HashMap<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        childParent.put(root,null);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                if(curr.left!=null){
                    childParent.put(curr.left, curr);
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    childParent.put(curr.right, curr);
                    q.add(curr.right);
                }
            }
        }

        HashSet<TreeNode> visited = new HashSet<>();
        q.add(target);
        visited.add(target);
        
        while(!q.isEmpty() && k>0){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();

                if(curr.left!=null && !visited.contains(curr.left)){
                    q.add(curr.left);
                    visited.add(curr.left);
                }

                if(curr.right!=null && !visited.contains(curr.right)){
                    q.add(curr.right);
                    visited.add(curr.right);
                }

                TreeNode parent = childParent.get(curr);
                if(parent!=null && !visited.contains(parent)){
                    q.add(parent);
                    visited.add(parent);
                }
            }
            
            k--;
        }

        while(!q.isEmpty())
            ans.add(q.remove().val);
        
        return ans;


    }
}