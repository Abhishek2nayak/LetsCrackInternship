package Trees.easy;

//Function to check whether a Binary Tree is BST or not.
public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
      static Node pre=null,suc=null
      You need to update these both.
      And the data inside these classes will be printed automatically by the driver code. 
    */
     
     findSuc(root,key);
     findPre(root,key);
     
     
    
    
   }
   
   static void findSuc(Node root,int key) {
       if(root == null) return;
       if(root.data > key) {
           if(suc == null) {
               suc = root;
           } else if(suc.data > root.data) {
               suc = root;
           }
           
          findSuc(root.left,key);
       }
       
       findSuc(root.right,key);
       
       
   }
   static void findPre(Node root,int key) {
       if(root == null) return;
       if(root.data < key) {
           if(pre == null) {
               pre = root;
           } else if(pre.data < root.data) {
               pre = root;
           }
           findPre(root.right,key);
       }
       
       findPre(root.left,key);
       
       
       
       
   }
}