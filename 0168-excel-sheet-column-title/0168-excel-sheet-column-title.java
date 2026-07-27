class Solution {
    public String convertToTitle(int col) {

    StringBuilder ans =   new StringBuilder();

        while(col >0){
            col--;

            int r = col % 26;

            ans = ans.append((char)('A'+r));

            col = col /26;

        }
        
        return ans.reverse().toString();
    }
}