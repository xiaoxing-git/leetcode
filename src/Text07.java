import java.util.ArrayList;

public class Text07 {

    public boolean isSymmetric(TreeNode root) {

       return f(root.left,root.right);
    }
    public boolean f(TreeNode p1,TreeNode p2){
        if (p1==null&&p2==null){
            return true;
        }
        if (p2==null||p1==null){
            return false;
        }
        return p1.val==p2.val&&f(p1.left,p2.right)&&f(p1.right,p2.left);
    }
}
