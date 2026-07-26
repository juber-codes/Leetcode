class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() ==0){
            return -1;
        }

        if(needle.length() > haystack.length()){
            return -1;
        }
        StringBuilder sb= new StringBuilder(haystack);

        StringBuilder s = new StringBuilder();
        for(int i=0; i<needle.length(); i++){
            s = s.append(sb.charAt(i));
        }

        if(s.toString().equals(needle)){
            return 0;
        }

        int j=needle.length();
        while(j<haystack.length()){

               s= s.deleteCharAt(0);
                s = s.append(haystack.charAt(j));

                if(s.toString().equals(needle)){
                    return j - needle.length()+1;
                }
                j++;

        }


        return -1;
    }
}