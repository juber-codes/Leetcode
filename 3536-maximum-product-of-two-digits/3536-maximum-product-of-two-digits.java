class Solution {
    public int maxProduct(int n) {
        
        // 31

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while(n>0){

            int last_digit= n%10;

            n = n/10;

            if(last_digit > max1){
                max2 = max1;
                max1 = last_digit;
            }
            else if(last_digit > max2){
                max2 = last_digit;
            }

        }


        return max1 * max2;
    }
}