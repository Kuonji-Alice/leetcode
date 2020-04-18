/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = 0, sum;
        ListNode ret = new ListNode(0);
        ListNode temp = ret;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + plus;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            plus = sum/10;
            l1 = l1.next;
            l2 = l2.next; 
        }
        while(l1 != null){
            sum = l1.val + plus;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            plus = sum/10;
            l1 = l1.next;
        }
        while(l2 != null){
            sum = l2.val + plus;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            plus = sum/10;
            l2 = l2.next;
        }
        if(plus != 0){
            temp.next = new ListNode(plus);
        }
        return ret.next;
    }
}