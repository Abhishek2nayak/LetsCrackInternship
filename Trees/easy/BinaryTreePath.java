class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        helper(root,"",l);
        return l;
    }
    public void helper(TreeNode root, String path,List<String> list) {
        if(root == null) return ;
        path += root.val + "->";
        helper(root.left,path,list);
        helper(root.right,path,list);
        if(root.left == null && root.right == null) {
list.add(path.substring(0,path.length() -2));
        }
        
    }
}