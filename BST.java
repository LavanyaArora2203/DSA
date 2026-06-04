public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static class InnerBST {
            Node root = null;

            public static Node insert(Node root, int val) {
                if (root == null) {
                    return new Node(val);
                }

                if (root.data < val) {
                    root.right = insert(root.right, val);
                } else {
                    root.left = insert(root.left, val);
                }

                return root;

            }

            public static boolean search(Node root, int val) {
                if (root == null) {
                    return false;
                }
                if (root.data == val) {
                    return true;
                }

                if (root.data > val) {
                    return search(root.left, val);
                } else {
                    return search(root.right, val);
                }

            }

            public static Node inorderSuccessor(Node root) {
                while (root.left != null) {
                    root = root.left;
                }
                return root;
            }

            public static Node delete(Node root, int val) {

                if (root == null) {
                    return null;
                }

                // ✅ Correct direction
                if (val < root.data) {
                    root.left = delete(root.left, val);

                } else if (val > root.data) {
                    root.right = delete(root.right, val);

                } else {
                    // Case 1: No child
                    if (root.left == null && root.right == null) {
                        return null;
                    }

                    // Case 2: One child
                    if (root.left == null) {
                        return root.right;
                    } else if (root.right == null) {
                        return root.left;
                    }

                    // Case 3: Two children
                    Node is = inorderSuccessor(root.right);
                    root.data = is.data;
                    root.right = delete(root.right, is.data);
                }

                return root;
            }

            public static void printlnRange(Node root, int x, int y) {
                if (root == null) {
                    return;
                }
                if (root.data >= x && root.data <= y) {
                    printlnRange(root.left, x, y);
                    System.out.println(root.data);
                    printlnRange(root.right, x, y);
                } else if (root.data >= y) {
                    printlnRange(root.left, x, y);

                } else {
                    printlnRange(root.right, x, y);
                }
            }

            public static void inorder(Node root) {
                if (root == null)
                    return;

                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }

            public static void main(String[] args) {
                int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
                Node root = null;

                for (int i = 0; i < values.length; i++) {
                    root = insert(root, values[i]);
                }

                printlnRange(root, 6, 10);
            }

        }
    }

}
