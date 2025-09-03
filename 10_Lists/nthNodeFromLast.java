import java.util.*;
class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){ this.val = val;}
        ListNode(int val, ListNode next){ this.val = val; this.next = next;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode curr = head;
        //calculates the size
        while(curr != null){
            curr=curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }
        //index to search
        int indexToSearch = size -n;
        ListNode prev = head;
        int i =1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        //now changing the next of the previous to the nth element to the next of nth element. Eg 3->5 from 3->4->5
        prev.next=prev.next.next;
        return head;
    }

    public class nthNodeFromLast {

    }
}