package LinkedList.easy;

/*
 * 
 * 
 * class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int[] count = {0,0,0};
        Node temp = head;
        while(temp != null) {
           int d = temp.data;
           switch(d) {
               case 0 : count[0]++; break;
               case 1 : count[1]++; break;
               case 2 : count[2]++; break;
           }
           temp = temp.next;
            
            
        }
        
        
        temp = head;
        while(temp != null) {
            int nodeData;
             if(count[0]-- > 0) {
                 nodeData = 0;
                //  count[0]--;
             } else if(count[1]-- > 0) {
                 nodeData = 1;
                //  count[1]--;
             } else {
                 nodeData = 2;
                //  count[2]--;
             }
             
             temp.data = nodeData;
             temp = temp.next;
        }
        
        return head;
        
        
        
        
    }
}


 */