//每K个节点进行翻转
public class ReverseKGroup {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode tail=head;
        for(int i=0;i<k;i++){
            if(tail==null){
                return head;
            }
            tail=tail.next;
        }
        ListNode newHead=reverse(head, tail);
        head.next=reverseKGroup(tail,k);
        return newHead;
    }
    public ListNode reverse(ListNode head,ListNode tail){
        ListNode pre=null;
        ListNode next=null;
        while(head!=tail){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
