class Solution {
    public int missingNumber(int[] nums) {

        int len = nums.length;

        //  [0 , len ] range

        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }

        int n = (len*(len+1)) /2;

        return n - sum;


    }
}