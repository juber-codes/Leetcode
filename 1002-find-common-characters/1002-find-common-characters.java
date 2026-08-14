class Solution {
    public List<String> commonChars(String[] words) {

        int[] alphabet = new int[26];

        // Count characters of first word
        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            alphabet[ch - 'a']++;
        }

        // Compare with every other word
        for (int i = 1; i < words.length; i++) {

            int[] current = new int[26];

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                current[ch - 'a']++;
            }

            // Keep minimum frequency
            for (int j = 0; j < 26; j++) {
                alphabet[j] = Math.min(alphabet[j], current[j]);
            }
        }

        // Create answer
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            while (alphabet[i] > 0) {
                char ch = (char) ('a' + i);
                ans.add(String.valueOf(ch));
                alphabet[i]--;
            }
        }

        return ans;
    }
}