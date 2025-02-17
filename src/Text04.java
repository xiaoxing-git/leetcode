

   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Text04 {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans-1;
    }
    public int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        int L=dfs(root.left);
        int R=dfs(root.right);
        ans = Math.max(ans,R+L+1);//把每一个节点都当成是根节点，求最长的
        return Math.max(L, R) + 1;
    }
}
