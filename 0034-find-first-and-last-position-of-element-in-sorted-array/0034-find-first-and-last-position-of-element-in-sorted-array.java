class Solution {
    int targetElement(int[] nums, int target, boolean flag){
        int result = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                result = mid;
                if(flag){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = targetElement(nums, target, true);
        int last = targetElement(nums, target, false);
        return new int[]{first, last};
    }
}