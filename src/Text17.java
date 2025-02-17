

public class Text17 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next=new ListNode(1);
        new Text17().isPalindrome(head);
    }
    public boolean isPalindrome(ListNode head) {
     //先记录一遍所有的值，再用双指针判断
        int[] ints = new int[100005];
        int ans=0;
        for (int i = 0; head!=null ; i++) {
            ints[i]=head.val;
            head=head.next;
            ans++;
        }
        for (int i=0,j=ans-1;i<j;i++,j--){
            if (ints[i]!=ints[j]){
                return false;
            }
        }
        return true;
    }
}
