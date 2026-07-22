class Solution {
    public int findGCD(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }

            if(nums[i] < min){
                min = nums[i];
            }
        }

        return gcd(max,min);
        
    }

    public static int gcd(int max, int min){

        while(max != min){

            if(max > min){
                max = max -min;
            }
            if(min > max){
                min = min - max;
            }
        }
        return max;
    }
}