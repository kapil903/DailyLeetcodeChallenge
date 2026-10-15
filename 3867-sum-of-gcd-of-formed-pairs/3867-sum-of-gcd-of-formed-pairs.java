class Solution {
    int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            prefixGcd[i] = findGCD(nums[i], max);
        }
        Arrays.sort(prefixGcd);
        int i = 0; 
        int j = n - 1;
        long sum = 0;
        while(i < j){
            sum += (long) findGCD(prefixGcd[j], prefixGcd[i]);
            i++;
            j--;
        }
        return sum;
    }
}