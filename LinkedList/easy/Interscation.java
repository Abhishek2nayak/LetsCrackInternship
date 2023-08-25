package LinkedList.easy;
/*
 * public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
      int n1 = lenOfList(headA);
      int n2 = lenOfList(headB);

      if(n1 > n2) {
          while(n1 != n2) {
              headA = headA.next;
              n1--;
          }
      } else if(n2 > n1) {
            while(n2!= n1) {
              headB = headB.next;
              n2--;
          }
      }

    while(headA != null && headB != null) {
        if(headA == headB) return headA;
        headA = headA.next;
        headB = headB.next;
    }

    return null;


    }

    public int lenOfList(ListNode node) {
        int count = 0;
        while(node != null) {
            count++;
            node = node.next;
        }

        return count;
    }
}
 */
