class Solution {
    public int titleToNumber(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

         int result =0;
        for(int i=0; i<26; i++){
            map.put( (char)('A'+i),i+1);
        }

        if(s.length()==1){
            return map.get(s.charAt(0));
        }
        else{
        
        int len = s.length();
        
        for(int i=0; i<s.length()-1; i++){
            result += map.get(s.charAt(i)) * Math.floor(Math.pow(26,len-1));
            len--;
        }

        result += map.get(s.charAt(s.length()-1));
        
        }
        
        return result;
    }
}