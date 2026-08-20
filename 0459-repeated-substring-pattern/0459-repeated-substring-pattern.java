class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        // Try every possible substring length
        for (int len = 1; len <= n / 2; len++) {

            // String length must be divisible by substring length
            if (n % len != 0) {
                continue;
            }

            String str = s.substring(0, len);

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n / len; i++) {
                result.append(str);
            }

            if (result.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}