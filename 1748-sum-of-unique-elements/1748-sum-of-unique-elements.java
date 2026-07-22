class Solution {
    public int sumOfUnique(int[] nums) {
        

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){

        if(map.containsKey(nums[i])){
            int fre = map.get(nums[i]);
            map.put(nums[i], fre+1);
        }
        else{
            map.put(nums[i], 1);
        }
        
    }
    

    int sum =0;
    for(int ele : map.keySet()){

        int fre = map.get(ele);

        if(fre == 1){
            sum = sum + ele;
        }
    }


    return sum;
    }
}