//链表是否有环 设快慢指针，快指针每次走两步，满指针每次走1步
public class HasCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

