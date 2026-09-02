class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        findPaths(root, "", result);

        return result;
    }

    public void findPaths(TreeNode root, String path, List<String> result) {

        // Add current node to path
        path += root.val;

        // If leaf node, add complete path
        if (isLeafNode(root)) {
            result.add(path);
            return;
        }

        path += "->";

        // Traverse left
        if (root.left != null) {
            findPaths(root.left, path, result);
        }

        // Traverse right
        if (root.right != null) {
            findPaths(root.right, path, result);
        }
    }

    public boolean isLeafNode(TreeNode root) {
        return root.left == null && root.right == null;
    }
}