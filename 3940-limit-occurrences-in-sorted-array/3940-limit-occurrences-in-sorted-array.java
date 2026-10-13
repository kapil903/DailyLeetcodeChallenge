class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] hash = new int[101];
        for(int num : nums){
            hash[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            if(hash[i] != 0){
                for(int j = 0; j < Math.min(k, hash[i]); j++){
                    list.add(i);
                }
            }
        }
        int[] ans = new int[list.size()];
        int ind = 0;
        for(int num : list){
            ans[ind++] = num;
        }
        return ans;
    }
}