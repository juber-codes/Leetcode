class Solution {
    public String mergeAlternately(String word1, String word2) {

        int a = word1.length();
        int b = word2.length();

        String s = "";

        while (a > 0 && b > 0) {
            s += word1.charAt(word1.length() - a);
            s += word2.charAt(word2.length() - b);
            a--;
            b--;
        }

        while (a > 0) {
            s += word1.charAt(word1.length() - a);
            a--;
        }

        while (b > 0) {
            s += word2.charAt(word2.length() - b);
            b--;
        }

        return s;
    }
}