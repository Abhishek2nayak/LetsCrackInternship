package LinkedList.medium;

/*class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n = calcLength(head);
        int [] nodes = nodesValue(head,n);
        left--;
        right--;
        while(left < right) {
            int temp = nodes[right];
            nodes[right] = nodes[left];
            nodes[left] = temp;
            left++;
            right--;
        }

        int i = 0;

        ListNode temp = head;
        while(temp != null) {
            temp.val = nodes[i++];
            temp =  temp.next;
        }


        return head;
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
       
} */