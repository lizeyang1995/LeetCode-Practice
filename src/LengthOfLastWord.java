public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  a a   "));
    }
    public static int lengthOfLastWord(String s) {
        int result = 0;
        String strip = s.strip();
        for (int i = strip.length() - 1; i >= 0; i--) {
            if (strip.charAt(i) != ' ') {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
