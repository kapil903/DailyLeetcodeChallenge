class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int end = nums.length - indexDifference;
        for(int i = 0; i < end; i++){
            int j = i + indexDifference;
            while(j < nums.length){
                if(Math.abs(nums[i] - nums[j]) >= valueDifference){
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return new int[]{-1, -1};
    }
}