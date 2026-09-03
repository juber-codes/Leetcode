class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // hashmap for nums2 
        // store with index
        // nums1[0] check the index in nums2
        // then loop for next greater element on nums2

        HashMap<Integer,Integer> map = new HashMap<>(); // index / val

     

        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i], i);
        }

         int [] result = new int[nums1.length];

        for(int j=0; j<nums1.length; j++){
            // get index of nums1[j] in hashmap

            int idx = map.get(nums1[j]);

            result[j] = -1;

            for(int ind = idx+1; ind<nums2.length; ind++){
                if( nums2[ind] > nums1[j] ){
                    result[j] = nums2[ind];
                    break;
                }
            }
        }
        
       

     

      return result;
    }
}