package 栈;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        addItem(root, result);
        return result;
    }
    public static void addItem(TreeNode item, List<Integer> result) {
        if (item == null) {
            return;
        }
        addItem(item.left, result);
        result.add(item.val);
        addItem(item.right, result);
    }
}
