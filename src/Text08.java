public class Text08 {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        left.right=new TreeNode(4,new TreeNode(1),null);
        TreeNode root = new TreeNode(1, left,new TreeNode(3));
        Text08 text08 = new Text08();
        int i = text08.maxDepth(root);
        System.out.println(i);
    }
    public int maxDepth(TreeNode root) {
        //递归
        //深度优先遍历
        return f(root);
    }
    public int f(TreeNode root){
        if (root==null)
            return 0;
        int L=f(root.left);
        int R=f(root.right);
        return Math.max(L,R)+1;
    }
}
