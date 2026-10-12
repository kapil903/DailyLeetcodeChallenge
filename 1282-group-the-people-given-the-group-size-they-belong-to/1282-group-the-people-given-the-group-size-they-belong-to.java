class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) continue;
            int cnt = nums[i];
            int size = nums[i];
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if(cnt == 0) break;
                if(nums[j] == size){
                    list.add(j);
                    nums[j] = 0;
                    cnt--;
                }
            }
            ans.add(list);
        }
        Collections.sort(ans, (a, b) -> Integer.compare(a.size(), b.size()));
        return ans;
    }
}