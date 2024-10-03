class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Q24 {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or root is p or q, return root
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for p and q in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If p and q are found in different subtrees, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null result (either left or right)
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        // Construct the binary tree [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;  // Node with value 5
        TreeNode q = root.right;  // Node with value 1

        TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + result.val);  // Output: 3
    }
}
