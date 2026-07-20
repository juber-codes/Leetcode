
class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
         int result = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = 0;
        int j = 1;

        while (i < s.length() && j < s.length()) {

            int ch = map.get(s.charAt(i));
            int ch1 = map.get(s.charAt(j));

            if (ch >= ch1) {
                result += ch;
                i++;
                j++;
            } else {
                result += (ch1 - ch);
                i += 2;
                j += 2;
            }
        }

        // If one character is left, add it.
        if (i < s.length()) {
            result += map.get(s.charAt(i));
        }
             return result;
    }
}