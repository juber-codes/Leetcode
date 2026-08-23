class Solution {
    public String sortString(String s) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        while (ans.length() < s.length()) {

            // Increasing order: a -> z
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    ans.append((char) ('a' + i));
                    freq[i]--;
                }
            }

            // Decreasing order: z -> a
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    ans.append((char) ('a' + i));
                    freq[i]--;
                }
            }
        }

        return ans.toString();
    }
}