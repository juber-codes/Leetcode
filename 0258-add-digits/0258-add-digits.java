class Solution {
    public int addDigits(int num) {

        while (true) {

            if (count_digit(num) == 1) {
                return num;
            } else {
                num = count_sum(num);
            }
        }
    }

    public int count_digit(int num) {

        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public int count_sum(int num) {

        int sum = 0;

        while (num > 0) {
            int last_digit = num % 10;
            sum = sum + last_digit;
            num = num / 10;
        }

        return sum;
    }
}