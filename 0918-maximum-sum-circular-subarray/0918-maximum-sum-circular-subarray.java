class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum < min) {
                min = sum;
            }

            if (sum > 0) {
                sum = 0;
            }
        }

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int sum2 = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum2 += nums[i];

            if (sum2 > maxsum) {
                maxsum = sum2;
            }

            if (sum2 < 0) {
                sum2 = 0;
            }
        }

        if (maxsum < 0) {
            return maxsum;
        }

        return Math.max(maxsum, total - min);
    }
}