package LinkedList.medium;

/*
 * class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        HashMap<Integer,Integer> hash = new HashMap<>();
        ListNode temp = head;
        while(temp != null) {
            hash.put(temp.val, hash.getOrDefault(temp.val,0) + 1);
            temp = temp.next;
        }
        
        temp = head;
        ListNode prev = null;

        while(temp != null) {
            if(hash.get(temp.val) > 1) {
                if(prev == null) {
                    head = temp;
                } else {
                    prev.next = temp.next;
                    temp = prev;
                }

            }
            prev = temp;
            temp = temp.next;
        }

        if(hash.get(head.val)  > 1) head = head.next;

        return head;
    }
}
 */