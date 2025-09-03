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
    public ListNode middleNode(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        int size=0;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        ListNode Size = head;
        int count=0;
        while(Size!=null){
            Size=Size.next;
            count++;
        }
        if(count%2==0){
            turtle=turtle.next;
        }
    return turtle;
    }
}

//leetcode 876