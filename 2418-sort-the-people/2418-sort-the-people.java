class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> mpp = new HashMap<>();
        int n = names.length;
        for(int i = 0; i < n; i++){
            mpp.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] ans = new String[n];
        int i = n - 1;
        for (int height : heights) {
            ans[i--] = mpp.get(height);
        }
        return ans;
    }
}