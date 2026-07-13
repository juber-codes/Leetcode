class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int count = 0;
            int max = candies[i] + extraCandies;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (max >= candies[j]) {
                        count++;
                    }
                }
            }

            result.add(count == n - 1);
        }

        return result;
    }
}