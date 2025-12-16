import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "Tact Coa";
        System.out.println(isPalindromePermutationUsingBitVector(str));
    }

    public static boolean isPalindromePermutation(String str) {
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() % 2 != 0 && entry.getValue() != 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromePermutationUsingBitVector(String str) {
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        int checker = 0;
        for (char ch : str.toCharArray()) {
            int val = ch - 'a';
            if ((checker & (1 << val)) != 0) { // if bit is set
                checker = checker ^ (1 << val); // unset bit
            } else {
                checker = checker | (1 << val); // set bit
            }
        }

        int count = 0;
        while (checker != 0) { // Or use Ineger.bitCount(checker)
            checker = checker & (checker - 1);
            count++;
        }
        return (count > 1) ? false : true;
    }
}
