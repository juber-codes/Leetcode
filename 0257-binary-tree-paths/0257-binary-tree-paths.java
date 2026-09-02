class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
    
    List<String> result = new ArrayList<>();

    if(root == null){
        return result;
    }

    findPath(root, "", result);

    return result;

    }

    public void findPath(TreeNode root, String path, List result){

        // add current path
        path += root.val;

        if( isLeafNode(root)){
            result.add(path);
            return ;
        }

        path +="->";

        // left side
        if(root.left != null){
            findPath(root.left, path, result);
        }

        if(root.right != null){
            findPath(root.right, path, result);
        }

    }

    public boolean isLeafNode(TreeNode root){
 return root.left == null && root.right == null;
    }

}