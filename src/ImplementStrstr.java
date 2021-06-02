public class ImplementStrstr {
    public static void main(String[] args) {
        int i = strStr("hello", "ll");
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("") || haystack.equals(needle)) {
            return 0;
        }
        int result = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    result = i;
                    if (j == needle.length() - 1) {
                        return result;
                    }
                    continue;
                }
                result = -1;
                break;
            }
        }

        return result;
    }
}
