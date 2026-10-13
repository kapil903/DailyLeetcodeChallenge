class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] hash = new int[101];
        for(int num : nums){
            hash[num]++;
        }
        int size = 0;
        for(int num : hash){
            size += Math.min(k, num);
        }
        int[] ans = new int[size];
        int ind = 0;
        for(int i = 0; i <= 100; i++){
            if(hash[i] == 0) continue;
            int cnt = Math.min(k, hash[i]);
            while(cnt > 0){
                ans[ind++] = i;
                cnt--;
            }
        }
        return ans;
    }
}