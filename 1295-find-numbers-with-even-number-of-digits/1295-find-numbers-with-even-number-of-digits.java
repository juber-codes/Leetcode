class Solution {
    public int findNumbers(int[] nums) {
        
        int n = nums.length;
        int even_count = 0;

        for(int i=0; i<n; i++){
            
            double digit =  Math.floor(Math.log10(10 * nums[i]));


            if(digit % 2 ==0){
                even_count++;
            }

            

          

        }

    return even_count;
    }
}