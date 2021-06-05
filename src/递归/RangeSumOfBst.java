package 递归;

import java.util.ArrayList;
import java.util.List;

public class RangeSumOfBst {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        getValue(root, low, high, result);
        return result.stream().mapToInt(Integer::intValue).sum();
    }

    public static void getValue(TreeNode item, int low, int high, List<Integer> result) {
        if (item != null && item.val >= low && item.val <= high) {
            result.add(item.val);
        } else if (item == null){
            return;
        }
        getValue(item.left, low, high, result);
        getValue(item.right, low, high, result);
    }
}
