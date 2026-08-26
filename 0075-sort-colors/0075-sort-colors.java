class Solution {
    public void sortColors(int[] nums) {
        int zero =0;
        int once = 0;
        int two = 0;

        // 2, 0 , 2 , 1 , 1 ,0
        // length = 6
        // zero = 2,
        // once = 2,
        // two = 2

        for(int i=0; i<nums.length; i++){

            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1) once++;
            else two++;

        }

        int length=0;
        while(length < nums.length){

            // zero
            for(int c0=0; c0<zero; c0++){
                nums[c0] = 0;
                length++;
            }

            // once
            for(int c1=0; c1<once; c1++){
                nums[length]=1;
                length++;
            } 

            for(int c2=0; c2<two; c2++) 
            {
                nums[length]=2;
                length++;
            }
        }

  
    }
}