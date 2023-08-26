package LinkedList.medium;

/*
 * class Solution {
    public void reorderList(ListNode head) {
        int len = calcLength(head);
        int[] nodes = nodesValue(head,len);


        //reorder array
        int pointer = 0;
        int right = len -1;
        ListNode temp = head;
        int left = 0;
        
        while(temp != null) {
            if(pointer %2 == 0) {
                temp.val = nodes[left];
                left++;
            } else {
                temp.val = nodes[right];
                right--;
            }
            pointer++;
            temp = temp.next;
        }

        
        
    

    }
     public int calcLength(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public int[] nodesValue(ListNode head, int n) {
        int[] arr = new int[n];
        int idx = 0;
        while(head != null) {
            arr[idx++]= head.val;
            head = head.next;
        }

        return arr;
    }

   
}
 */