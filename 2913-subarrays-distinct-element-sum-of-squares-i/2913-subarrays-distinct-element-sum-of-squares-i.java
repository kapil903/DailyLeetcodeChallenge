class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            int[] hash = new int[101];
            for(int j = i; j < nums.size(); j++){
                hash[nums.get(j)]++;
                int cnt = 0;
                for(int num : hash){
                    if(num != 0){
                        cnt++;
                    }
                }
                sum += cnt * cnt;
            }
        }
        return sum;
    }
}