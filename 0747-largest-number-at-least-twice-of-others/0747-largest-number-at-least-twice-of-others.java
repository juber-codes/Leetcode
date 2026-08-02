class Solution {
    public int dominantIndex(int[] nums) {


        int ind =-1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){

            if(nums[i] > max){
                max = nums[i];
                ind = i;
            }
        }

    
        for(int j=0; j<nums.length; j++){

            if(j == ind) continue;

            if(2 * nums[j]  > max){
                return -1;
            }
           
       
        }


        
        return ind;
    }
}