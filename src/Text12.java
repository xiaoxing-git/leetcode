
  class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2(int x) {
          val = x;
          next = null;
      }
  }

public class Text12 {
    public boolean hasCycle(ListNode2 head) {
        for (int i = 0; i <10000 ; i++) {
            if (head.next==null){
                return false;
            }else {
                head=head.next;
            }
        }
        return true;
    }
}
