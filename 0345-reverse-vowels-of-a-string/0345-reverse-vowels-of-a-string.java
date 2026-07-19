class Solution {
    public String reverseVowels(String s) {
        
        char[] snew = s.toCharArray();

        int i=0;
        int j=s.length()-1;

        while(i<j){

            if(isVowel(snew[i]) && isVowel(snew[j])){
                char ch =  snew[i];
                snew[i] = snew[j];
                snew[j] = ch;
                i++;
                j--;
            }

            if(!isVowel(snew[i])){
                i++;
            }
            if(!isVowel(snew[j])){
                j--;
            }

        }

 
    String result = new String(snew);
    return result;
    }


    public boolean isVowel(char ch){
        if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch == 'u'){
            return true;
        }

         if(ch == 'A' || ch =='E' || ch == 'I' || ch =='O' || ch == 'U'){
            return true;
        }
        

        return false;
    }
}