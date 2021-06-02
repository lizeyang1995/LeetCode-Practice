public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("101111", "10"));
    }
    public static String addBinary(String a, String b) {
        String[] splitA = a.split("");
        String[] splitB = b.split("");
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(splitA.length, splitB.length);
        boolean plusOne = false;
        for (int i = 0; i < minLength; i++) {
            int intA = Integer.parseInt(splitA[splitA.length - 1 - i]);
            int intB = Integer.parseInt(splitB[splitB.length - 1 - i]);
            if (intA + intB == 2) {
                if (plusOne) {
                    result.append(1);
                } else {
                    result.append(0);
                }
                plusOne = true;
            } else if (intA + intB == 1) {
                if (plusOne) {
                    result.append(0);
                } else {
                    result.append(1);
                }
            } else {
                if (plusOne) {
                    result.append(1);
                } else {
                    result.append(0);
                }
                plusOne = false;
            }
        }
        for (int i = 0; i < Math.abs(splitA.length - splitB.length); i++) {
            if (splitA.length >= splitB.length) {
                int i1 = Integer.parseInt(splitA[splitA.length - minLength - 1 - i]);
                if (plusOne && i1 == 1) {
                    result.append(0);
                } else if (plusOne) {
                    result.append(1);
                    plusOne = false;
                } else {
                    result.append(i1);
                }
            } else {
                int i1 = Integer.parseInt(splitB[splitB.length - minLength - 1 - i]);
                if (plusOne && i1 == 1) {
                    result.append(0);
                } else if (plusOne) {
                    result.append(1);
                    plusOne = false;
                } else {
                    result.append(i1);
                }
            }
        }
        if (plusOne) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
