class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int count_prime =0;

        for(int i=left; i<=right; i++){

            String s = Binary(i);
            int countsetBit = countBit(s);

            if(isPrime(countsetBit)){
                count_prime++;
            }

        }
return count_prime;
    }


    public boolean isPrime(int n){

        if(n == 1 || n==0)return false;

        for(int i=2; i*i<=n; i++){
            if(n % i==0)return false;
        }

        return true;
    }

    // 2^0 = 0; 2^1 = 2; 2^2 = 4;

    public String Binary(int n){

        if(n == 0){
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while(n > 0){
            int remainder = n % 2 ;

            binary.append(remainder);
            n= n/2;
        }
        return binary.reverse().toString();
    }

    public int countBit(String s){

        if(s.length() == 0) return 0;

        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '1'){
                count++;
            }
        }
        return count;
    }
}