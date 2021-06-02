public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber != 0) {
            int remainder = columnNumber % 26 == 0 ? 26 : columnNumber % 26;
            result.insert(0, (char) ('A' + remainder - 1));
            columnNumber = (columnNumber - remainder) / 26;
        }
        return result.toString();
    }
}
