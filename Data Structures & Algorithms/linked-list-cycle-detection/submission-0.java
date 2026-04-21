/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {

        Set<Integer> vals = new HashSet<>();
        while(head.next != null) {
            if(vals.add(head.val)) {
                head = head.next;
            } else {
                return true;
            }
        }

        return false;
        
    }
}
