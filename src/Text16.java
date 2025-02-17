public class Text16 {
    public TreeNode invertTree(TreeNode root) {
        return f(root);
    }
    public TreeNode f(TreeNode root){
        if (root!=null){
            TreeNode p1=root.left;
            TreeNode p2=root.right;
            root.left=root.right;
            root.right=p1;
            f(p1);
            f(p2);
        }
        return root;
    }
}
