class Solution {
    public int maxVowels(String s, int k) {

        int i=0, j=0, res=0, window=0;

        for(j=0; j<k; j++){
            char ch = s.charAt(j);
            if(isVowel(ch)){
                window = window + 1;
            }
        }

        res = window;

        while(j<s.length()){

            if(isVowel(s.charAt(i))){
                window = window - 1;
                
            }
            i++;
            if(isVowel(s.charAt(j))){
                window = window+1;
                
            }
            j++;

            res = Math.max(res, window);
        }

        return res;
    }

    public boolean isVowel(char ch){

        if( ch == 'a' ||
            ch == 'e' ||
            ch == 'i' ||
            ch == 'o' ||
            ch == 'u' ) return true;

    return false;
     }

}