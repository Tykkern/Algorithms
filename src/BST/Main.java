package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {17, 6, 5, 20, 19, 18, 11, 14, 12, 13, 2, 4, 10};

        for (int value : values) {
            bst.insert(value);
        }

        System.out.print("Симметричный обход: ");
        bst.printInOrder();

        for (int i = 0; i < 10; i++) {
            TreeNode node = bst.getIthNode(i);
            if (node != null) {
                System.out.println(i + "-й узел: " + node.value);
            }
        }
    }
}