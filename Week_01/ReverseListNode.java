 //链表反转
   //   Definition for singly-linked list.
   class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
   public class ReverseListNode {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode p=null;
        while(head!=null){
            ListNode nodeNext=head.next;
            head.next=p;
            p=head;
            head=nodeNext;
        }
        return p;
    }
}
