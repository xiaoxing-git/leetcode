import java.util.HashMap;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Text13 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode next = new ListNode(2);
        headA.next= next;
        ListNode headB = new ListNode(3);
        headB.next=next;
        new Text13().getIntersectionNode(headA,headB);
    }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //使用哈希表检验
            //创建一个哈希表
            HashSet<ListNode> listNodes = new HashSet<>();
            while (headA!=null){
                listNodes.add(headA);
                headA=headA.next;
            }
            while (headB!=null){
                boolean node = listNodes.add(headB);
                if (!node){
                    return headB;
                }
                headB=headB.next;
            }
            return null;
        }

}
