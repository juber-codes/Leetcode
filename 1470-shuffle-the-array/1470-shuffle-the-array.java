class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr1 = new int [n];
        int []arr2 = new int [n];

     

        for(int i=0; i<n; i++){
            arr1[i] = nums[i];
        }
        for(int j=0; j<n;j++){
            arr2[j] = nums[j+n];
        }

        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<n){

            nums[k]  = arr1[i];
            i++;
            k++;

            nums[k] = arr2[j];
            k++;
            j++; 
        }

        return nums;
    }
}