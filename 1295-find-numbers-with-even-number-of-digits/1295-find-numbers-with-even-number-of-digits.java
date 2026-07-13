class Solution {
    public int findNumbers(int[] nums) {
        
        int n = nums.length;
        int even_count = 0;

        for(int i=0; i<n; i++){
            int count =0;

            while(nums[i] > 0){
                count++;
                nums[i] = nums[i] /10;
            }

            if(count % 2 ==0){
                even_count++;
            }

        }

    return even_count;
    }
}