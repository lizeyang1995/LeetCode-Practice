import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String result = longestCommonPrefix(new String[]{"ac", "a"});
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        String strsOne = strs[0];
        for (int i = 0; i < strsOne.length(); i++) {
            char charI = strsOne.charAt(i);
            for (String str : strs) {
                if (str.length() == i || charI != str.charAt(i)) {
                    return result.toString();
                }
            }
            result.append(charI);
        }
        return result.toString();
    }
}
