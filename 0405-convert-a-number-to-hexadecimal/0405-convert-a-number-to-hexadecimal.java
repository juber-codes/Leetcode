class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        if (num > 0) {

            while (num > 0) {

                int r = num % 16;

                if (r < 10) {
                    ans.append((char) (r + '0'));
                } else {
                    ans.append((char) ('a' + r - 10));
                }

                num = num / 16;
            }

        } else {

            while (num != 0) {

                int r = num & 15;

                if (r < 10) {
                    ans.append((char) (r + '0'));
                } else {
                    ans.append((char) ('a' + r - 10));
                }

                num = num >>> 4;
            }
        }

        return ans.reverse().toString();
    }
}