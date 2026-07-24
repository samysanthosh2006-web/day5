import java.util.Hashtable;

class Solution {
    public int romanToInt(String s) {
        Character[] symbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] nums = { 1, 5, 10, 50, 100, 500, 1000 };

        Hashtable<Character, Integer> romans = new Hashtable<Character, Integer>();

        for (int i = 0; i < nums.length; i++) {
            romans.put(symbols[i], nums[i]);
        }

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romans.get(s.charAt(i));
            int next = 0;

            if (i + 1 < s.length()) {
                next = romans.get(s.charAt(i + 1));
            }

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}