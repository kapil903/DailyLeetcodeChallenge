class Solution {
    long num(int num1, int num2){
        int cnt = 0;
        int n = num2;
        while(n > 0){
            cnt++;
            n /= 10;
        }
        if (num2 == 0) cnt = 1;
        long power = 1;
        for (int k = 0; k < cnt; k++) {
            power *= 10;
        }
        return power * num1 + num2;
    }
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        long value = 0;
        while(i <= j){
            if(i == j) value += nums[i];
            else{
                value += num(nums[i], nums[j]);
            }
            i++;
            j--;
        }
        return value;
    }
}