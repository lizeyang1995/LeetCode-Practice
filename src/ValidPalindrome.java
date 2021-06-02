public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowCase = newStr.toLowerCase();
        for (int i = 0; i < lowCase.length() / 2; i++) {
            if (lowCase.charAt(i) != lowCase.charAt(lowCase.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
