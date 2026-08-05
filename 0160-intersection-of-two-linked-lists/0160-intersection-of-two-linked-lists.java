/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int sizeA = sizeOfList(headA);
        int sizeB = sizeOfList(headB);

        ListNode A = headA;
        ListNode B = headB;

        while(sizeA > sizeB){
            A = A.next;
            sizeA--;
        }

        while(sizeB > sizeA ){
            B = B.next;
            sizeB--;
        }

        while(A != null && B!= null){

            if(A == B){
                return A;
            }

            A = A.next;
            B = B.next;
        }

        return null;

    }

    public int sizeOfList(ListNode head){

        int size =0;

        ListNode temp = head;
        while(temp!=null){
                        size++;

            temp = temp.next;
        }

        return size;
    }
}