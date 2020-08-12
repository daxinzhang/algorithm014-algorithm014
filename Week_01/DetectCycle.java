import java.util.HashSet;
import java.util.Set;

//检测环入口
// 1.检测是否有入口，有的话在头与相遇点各设一指针，每次两指针都移动一步直到相等，即为入口
public class DetectCycle {
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

    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow=head;
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
//2.哈希:建一个set 看是否已包含当前节点，若有，则此节点为入口，否则检查下一节点
class Solution1 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> hash=new HashSet<>();
        while(head!=null){
            if(hash.contains(head)){
                return head;
            }else{
                hash.add(head);
                head=head.next;
            }
        }
        return null;
    }
}
