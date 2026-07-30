
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        // Number of pattern characters and words must be same
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // Check char -> word mapping
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } 
            else {
                map.put(ch, word);
            }

            // Check word -> char mapping
            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != ch) {
                    return false;
                }
            } 
            else {
                reverseMap.put(word, ch);
            }
        }

        return true;
    }
}

