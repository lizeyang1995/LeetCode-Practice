package 排序;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] inputValue = {3, 4, 15, 2, 9, 4};
        System.out.println(largestPerimeter(inputValue));
    }

    private static int largestPerimeter(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        for (int i = nums.length - 1; i >= 2; i--) {
            int first = nums[i];
            int second = nums[i - 1];
            int three = nums[i - 2];
            if (second + three > first) {
                return first + second + three;
            }
        }
        return 0;
    }

}
