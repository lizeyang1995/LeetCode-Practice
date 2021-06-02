import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("LVIII");
    }

    public static int romanToInt(String s) {
        Map<String, Integer> mappedRoman = new HashMap<String, Integer>();
        mappedRoman.put("I", 1);
        mappedRoman.put("V", 5);
        mappedRoman.put("X", 10);
        mappedRoman.put("L", 50);
        mappedRoman.put("C", 100);
        mappedRoman.put("D", 500);
        mappedRoman.put("M", 1000);

        String[] splited = s.split("");
        int sum = 0;

        int length = splited.length;
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && mappedRoman.get(splited[i]) < mappedRoman.get(splited[i + 1])) {
                sum += mappedRoman.get(splited[i + 1]) - mappedRoman.get(splited[i]);
            } else {
                sum += mappedRoman.get(splited[i]);
            }
        }

        System.out.println(sum);
        return sum;
    }
}
