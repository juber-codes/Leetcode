class Solution {
    public List<String> commonChars(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of first word
        for (int i = 0; i < words[0].length(); i++) {

            char ch = words[0].charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Compare with remaining words
        for (int i = 1; i < words.length; i++) {

            HashMap<Character, Integer> current = new HashMap<>();

            String str = words[i];

            for (int j = 0; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (current.containsKey(ch)) {
                    current.put(ch, current.get(ch) + 1);
                } else {
                    current.put(ch, 1);
                }
            }

            // Keep minimum frequency
            for (char ch : map.keySet()) {

                if (current.containsKey(ch)) {

                    int min = Math.min(
                        map.get(ch),
                        current.get(ch)
                    );

                    map.put(ch, min);

                } else {
                    map.put(ch, 0);
                }
            }
        }

        List<String> ans = new ArrayList<>();

        // Build answer
        for (char ch : map.keySet()) {

            int count = map.get(ch);

            while (count > 0) {
                ans.add(String.valueOf(ch));
                count--;
            }
        }

        return ans;
    }
}