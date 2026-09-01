class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // total size = m + n;
        // if even the (nums[mid] + nums[mid+1])
        // if odd then nums[mid]


        int totalSize = nums1.length + nums2.length;

        int i=0; 
        int j=0; 

        int prev =0;
        int curr =0;

        for(int count =0; count <= totalSize /2; count++){
            prev = curr;

            // for num1
            if(i < nums1.length && (j >=nums2.length || nums1[i] <= nums2[j]) ){
                curr = nums1[i];
                i++;
            }else{
                curr = nums2[j];
                j++;
            }
        }

        // odd 
        if(totalSize % 2 != 0){
            return curr;
        }else{
            return ( prev + curr ) /2.0;
        }

    }
}