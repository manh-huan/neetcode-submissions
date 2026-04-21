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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode res = new ListNode(0, null);
        ListNode current = res;
        
        while(list1 != null && list2 != null) {
            int val1 = list1.val;
            int val2 = list2.val;
            if(val1 < val2) { 
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return res.next;
    }
}