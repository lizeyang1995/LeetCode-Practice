package 栈;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length / 2; i++) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.length() == 0;
    }
}
