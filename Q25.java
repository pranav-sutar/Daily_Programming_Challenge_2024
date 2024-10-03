class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Q25 {

    // Helper function to validate the BST with a range of allowed values for the node
    private static boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;

        // Check if the current node's value is within the allowed range
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }

        // Recursively check the left and right subtrees with updated ranges
        if (!isValidBST(node.right, val, upper)) {
            return false;
        }
        if (!isValidBST(node.left, lower, val)) {
            return false;
        }

        return true;
    }

    // Main function to check if a binary tree is a valid BST
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public static void main(String[] args) {
        // Construct the binary tree [2, 1, 3]
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean result = isValidBST(root);
        System.out.println("Is the tree a valid BST? " + result);  // Output: true
    }
}
