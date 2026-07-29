class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
          List<Integer> result = new ArrayList<>();
        for(int i = left; i<=right; i++){

            int num =i;
            boolean isSelfDiv = true;

            while(num >0){

                int last_digit = num % 10;
                if(last_digit ==0 || i % last_digit !=0){
                    isSelfDiv=false;
                    break;
                }

                num = num /10;
            }

            if(isSelfDiv){
                result.add(i);
            }
        }

     

        return result;

    }
}