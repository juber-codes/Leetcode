class Solution {
    public int mySqrt(int x) {

        // ans = Sqrt(x)
        
        double ans= 0.5 * Math.log10(x);

        return (int)Math.pow(10,ans);
    }
}