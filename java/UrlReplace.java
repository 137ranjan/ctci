public class UrlReplace {
    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        String output = urlify(input, 13);
        System.out.println(output);
    }

    public static String urlify(String str, int trueLength) {
        char[] charArr = str.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (charArr[i] == ' ') {
                spaceCount++;
            }
        }
        int step = spaceCount * 2;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (charArr[i] != ' ') {
                charArr[i + step] = charArr[i];
            } else {
                int j = i + step;
                charArr[j] = '0';
                charArr[j - 1] = '2';
                charArr[j - 2] = '%';
                step -= 2;
                if (step == 0) {
                    break;
                }
            }
        }
        return new String(charArr);
    }
}
