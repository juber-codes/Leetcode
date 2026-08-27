class Solution {
    public String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        boolean negative = false;

        if (num < 0) {
            negative = true;
            num = num * -1;
        }

        StringBuilder result = new StringBuilder();

        while (num > 0) {

            int r = num % 7;

            result.append(r);

            num = num / 7;
        }

        result.reverse();

        if (negative) {
            result.insert(0, "-");
        }

        return result.toString();
    }
}