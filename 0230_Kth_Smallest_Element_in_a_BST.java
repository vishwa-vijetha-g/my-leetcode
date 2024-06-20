class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> elements = new ArrayList<>();
        inorder(root,elements);
        return elements.get(k-1);
    }

    public void inorder(TreeNode root, ArrayList<Integer> elements){
        if(root==null) return ;

        inorder(root.left,elements);
        elements.add(root.val);
        inorder(root.right,elements);
    }
}