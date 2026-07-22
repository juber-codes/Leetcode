class Solution {
    public boolean isPowerOfTwo(int n) {

        String binary = Int_to_binary( n);
        int count = 0;
        for(int i=0; i<binary.length(); i++){
            char ch = binary.charAt(i);

            if(ch == '1'){
                count++;
            }

        }

        if(count ==1){
            return true;
        }

        return false;
        
    }

    public String Int_to_binary(int n){
        
        String binary = "";

        while(n > 0){

            binary = (n % 2) + binary;
            n = n/2;
        }

        return binary;
    }
}