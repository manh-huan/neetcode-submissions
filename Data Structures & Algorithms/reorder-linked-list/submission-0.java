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


//Brute Force solution
class Solution {
    public void reorderList(ListNode head) {

        List<ListNode> listNodes = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            listNodes.add(current);
            current = current.next;
        }
        int size = listNodes.size();
        int i = 0;
        int j = size -1;
        while(i < j) {
            listNodes.get(i).next = listNodes.get(j);
            i++;
            if(i<j) {
                listNodes.get(j).next = listNodes.get(i);
                j--;
            }
        }
        listNodes.get(i).next = null;
    }
}
