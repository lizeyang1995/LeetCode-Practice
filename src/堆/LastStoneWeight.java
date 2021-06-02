package 堆;

import java.util.Arrays;

public class LastStoneWeight {
    public static void main(String[] args) {

    }
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int length = stones.length - 1;
        for (int i = length; i > 0; i--) {
            stones[length] = stones[length] - stones[length - 1];
            stones[length - 1] = 0;
            Arrays.sort(stones);
        }
        return stones[length];
    }
}
