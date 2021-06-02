import java.math.BigInteger;
import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        int[] input = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(input)));
    }
    public static int[] plusOne(int[] digits) {
//        int length = digits.length;
//        ArrayList<Integer> result = new ArrayList<>();
//        boolean plusOne = false;
//        digits[length - 1] += 1;
//        for (int i = length - 1; i >= 0; i--) {
//            if (plusOne) {
//                digits[i] += 1;
//                if (digits[i] != 0) {
//                    plusOne = false;
//                    break;
//                }
//            }
//            if (digits[i] == 10) {
//                digits[i] = 0;
//                plusOne = true;
//            }
//            result.add(0, digits[i]);
//        }
//        if (plusOne) {
//            result.add(0, 1);
//        }
//        return result.stream().mapToInt(Integer::valueOf).toArray();

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
