import java.util.LinkedList;
import java.util.List;

   class ListNode1 {
      int val;
     ListNode next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Text03 {
       ListNode p1;//标记比较到list1节点的位置
       ListNode p2;//用与比较到list2节点的位置
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rt = new ListNode(-1);
        ListNode flog= rt;//头节点
        p1=list1;
        p2=list2;
        while (p1!=null&&p2!=null){
            if (p1.val<=p2.val){
                flog.next=p1;
                p1=p1.next;
            }else {
                flog.next=p2;
                p2=p2.next;
            }
            flog=flog.next;
        }
        flog.next=p1==null?p2:p1;
        return rt.next;
    }
}
