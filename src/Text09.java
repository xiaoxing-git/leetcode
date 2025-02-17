public class Text09 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //有则相加，无则替换
        //递归，前序遍历
     return f(root1,root2);
    }
    public TreeNode f(TreeNode root1 , TreeNode root2){
       if (root1==null){
           return root2;
       }
       if (root2==null){
           return root1;
       }
        TreeNode newNode = new TreeNode(root1.val + root2.val);
       newNode.left=f(root1.left,root2.left);
       newNode.right=f(root1.right,root2.right);
       return newNode;
    }
}
