class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ind = 0;
        int min = nums.length;
        while(ind < nums.length){
            if(nums[ind] == target){
                min = Math.min(Math.abs(ind - start), min);
            }
            ind++;
        }
        return min;
    }
}