class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}





public class CheckSubtreeInBinaryTree {
    public static void main(String[] args) {
        TreeNode mainTree = new TreeNode(1);
        mainTree.left = new TreeNode(2);
        mainTree.right = new TreeNode(3);
        mainTree.left.left = new TreeNode(4);
        mainTree.left.right = new TreeNode(5);

        TreeNode subTree = new TreeNode(2);
        subTree.left = new TreeNode(4);
        subTree.right = new TreeNode(5);

        System.out.println(isSubtree(mainTree, subTree));
    }

    public static boolean isSubtree(TreeNode mainTree, TreeNode subTree) {
        if (mainTree == null) {
            return false;
        }
        if (isIdentical(mainTree, subTree)) {
            return true;
        }
        return isSubtree(mainTree.left, subTree) || isSubtree(mainTree.right, subTree);
    }

    public static boolean isIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return (node1.val == node2.val) && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }
}
