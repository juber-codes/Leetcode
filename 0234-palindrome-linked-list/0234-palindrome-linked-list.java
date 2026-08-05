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
    public boolean isPalindrome(ListNode head) {

    //     List<Integer> list = new ArrayList<>();

    //     ListNode temp = head;

    //     while(temp!=null){
    //         list.add(temp.val);
    //         temp = temp.next;
    //     }

    //     int i=0;
    //     int j = list.size() -1;

    //     while(i < j){

    //         if(list.get(i) != list.get(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
      
    // return true;

        ListNode fast = head;
        ListNode  slow = head;

        while(fast != null && fast.next!= null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev =null;

        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;

        }

        ListNode first = head;
        ListNode second = prev;

        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }

    return true;
        

 }
    
}