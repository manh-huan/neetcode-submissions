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

//Brute force solution
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        List<ListNode> nodeArray = new ArrayList<>();
        ListNode currentNode = head;

        while(currentNode != null) {
            nodeArray.add(currentNode);
            currentNode = currentNode.next;
        }

        int removeIndex = nodeArray.size() - n;
        if (removeIndex == 0) {
            return head.next;
        }
  
        nodeArray.get(removeIndex - 1).next = nodeArray.get(removeIndex).next;
       
        return head;
    }
}








