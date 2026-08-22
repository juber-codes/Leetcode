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
    public ListNode sortList(ListNode head) {

        int length =0;

        ListNode temp = head;

        // find len

        while(temp!=null){
            length++;
            temp=temp.next;
        }

        // strore list val in arr
        temp = head;

        int []arr = new int [length];
        int i=0;

        while(temp!=null){
            arr[i] = temp.val;
            i++;
            temp=temp.next;
        }

        // sort the arr

        Arrays.sort(arr);

        // put back value in list

        temp = head;
        int j=0;

        while(temp!=null){
            temp.val = arr[j];
            temp = temp.next;
            j++;
        }

    return head;
    }
}