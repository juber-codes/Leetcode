class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1; // use the even part
                hasOdd = true;     // remember an odd exists
            }
        }

        if (hasOdd) {
            count++; // place one odd character in the center
        }

        return count;
    }
}