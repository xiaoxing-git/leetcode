import java.util.ArrayList;
import java.util.List;


public class Text06 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2),new TreeNode(3));

        new Text06().inorderTraversal(root);
    }
    ArrayList<Integer> list ;
    public List<Integer> inorderTraversal(TreeNode root) {
        //中序遍历
        //递归遍历左右子树
        list = new ArrayList<>();

        f(root);
        return list;
    }
    public void  f(TreeNode root){
        if(root!=null){
             f(root.left);
            list.add(root.val);
             f(root.right);
        }
    }
}
