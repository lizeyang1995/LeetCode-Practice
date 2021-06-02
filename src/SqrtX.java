public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {
//        for (int i = 1; i <= x / 2; i++) {
//            if (x / i >= i && x / (i + 1) < (i + 1)) {
//                return i;
//            }
//            if (x / i > i && x / (i + 1) <= (i + 1)) {
//                return i + 1;
//            }
//        }
//        return x;

        int result = 0;
        int left = 0;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
