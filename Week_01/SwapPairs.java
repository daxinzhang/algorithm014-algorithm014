
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }*/
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode cur=pre;
        while(cur.next!=null&&cur.next.next!=null){
            ListNode cNN=cur.next.next;
            ListNode cN=cur.next;
            cur.next=cNN;
            cN.next=cNN.next;
            cNN.next=cN;
            cur=cN;
        }
        return pre.next;
    }
}
//2.递归
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return next;
    }
}
