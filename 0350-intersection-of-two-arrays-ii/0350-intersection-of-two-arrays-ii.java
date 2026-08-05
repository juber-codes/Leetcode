class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // Build frequency map
        for (int ele : nums1) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Find intersection
        for (int ele : nums2) {
            if (map.containsKey(ele) && map.get(ele) > 0) {
                ans.add(ele);
                map.put(ele, map.get(ele) - 1);
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}