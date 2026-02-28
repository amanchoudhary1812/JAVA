import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class UnivaluedBinaryTree965 {

    public static boolean isUnivalTree(TreeNode root) {
        return dfs(root, root.val);
    }

    private static boolean dfs(TreeNode node, int value) {
        if (node == null) return true;

        if (node.val != value) return false;

        return dfs(node.left, value) && dfs(node.right, value);
    }

    // Build tree using level order input
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            if (!values[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.left);
            }
            i++;

            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree nodes in level order (use 'null' for empty):");
        String input = sc.nextLine();

        String[] values = input.split(" ");

        TreeNode root = buildTree(values);

        boolean result = isUnivalTree(root);

        System.out.println("Is Univalued Binary Tree: " + result);

        sc.close();
    }
}