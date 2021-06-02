package 栈;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {

    }

    public static String removeDuplicates(String s) {
//        Stack<String> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            String item = String.valueOf(s.charAt(i));
//            if (stack.isEmpty() || !stack.peek().equals(item)) {
//                stack.push(item);
//            } else if (stack.peek().equals(item)) {
//                stack.pop();
//            }
//        }
//        StringBuilder result = new StringBuilder();
//        for (String value : stack) {
//            result.append(value);
//        }
//        return result.toString();

        char[] chars = s.toCharArray();
        int top = -1;
        for (int i = 0; i < chars.length; i++) {
            if (top == -1 || chars[top] != chars[i]) {
                chars[++top] = chars[i];
            } else {
                top--;
            }
        }
        return String.valueOf(chars, 0, top + 1);
    }
}
