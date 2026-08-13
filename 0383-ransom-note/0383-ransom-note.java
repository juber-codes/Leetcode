class Solution {
    public boolean canConstruct(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<t.length(); i++){

            char ch = t.charAt(i);

            if(map.containsKey(ch)){
                int fre = map.get(ch);
                map.put(ch, fre+1);
            }
            else{
                map.put(ch,1);
            }
        }
    
    

    for(int j=0; j<s.length(); j++){

        char char1= s.charAt(j);

        if(! map.containsKey(char1) || map.get(char1) == 0) {
            return false;
        }else{
            int fre1 = map.get(char1);
            map.put(char1, fre1-1);
        }
    }

    return true;
}
}