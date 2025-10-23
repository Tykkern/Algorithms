package BST;

class BinarySearchTree {
    TreeNode root;
    private int count;
    private TreeNode result;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    public TreeNode getIthNode(int i) {
        count = 0;
        result = null;
        inOrderTraversal(root, i);
        return result;
    }

    private void inOrderTraversal(TreeNode node, int targetIndex) {
        if (node == null || result != null) return;

        inOrderTraversal(node.left, targetIndex);

        if (count == targetIndex && result == null) {
            result = node;
            return;
        }
        count++;

        inOrderTraversal(node.right, targetIndex);
    }

    public void printInOrder() {
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(TreeNode node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.print(node.value + " ");
            printInOrderRec(node.right);
        }
    }
}