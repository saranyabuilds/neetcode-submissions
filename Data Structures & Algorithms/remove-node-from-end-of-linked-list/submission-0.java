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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode cur = head;
        // Add all nodes to arrayList
        while(cur != null){
            nodeList.add(cur);
            cur = cur.next;

        }
        // calculate the node position to be remove
        int len = nodeList.size()-n;

        // if len is 0 which means the head needs to be removed.add()
        if(len == 0){
            head = head.next;
            return head;
        }

        nodeList.get(len-1).next = nodeList.get(len).next;
        return head;
    }
}
