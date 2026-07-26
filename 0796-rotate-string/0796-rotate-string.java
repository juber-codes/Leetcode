class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String snew = s + s;

        StringBuilder ch = new StringBuilder();

        // First window
        for (int i = 0; i < goal.length(); i++) {
            ch.append(snew.charAt(i));
        }

        if (ch.toString().equals(goal)) {
            return true;
        }

        int j = goal.length();

        while (j < snew.length()) {

            ch.deleteCharAt(0);          // Remove first character
            ch.append(snew.charAt(j));   // Add next character

            if (ch.toString().equals(goal)) {
                return true;
            }

            j++;
        }

        return false;
    }
}