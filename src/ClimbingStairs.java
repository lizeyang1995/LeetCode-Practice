public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int sum = i1 + i2;
            i1 = i2;
            i2 = sum;
        }
        return 0;
    }
}
