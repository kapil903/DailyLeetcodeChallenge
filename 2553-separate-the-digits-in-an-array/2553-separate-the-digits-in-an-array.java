class Solution {

    void digits(List<Integer> list, int num){
        int pow = 1;
        int n = num;
        while(n >= 10){
            pow *= 10;
            n /= 10;
        }
        while(pow > 0){
            list.add(num / pow);
            num %= pow;
            pow /= 10;
        }
    }
    public int[] separateDigits(int[] nums) {
        List<Integer> list= new ArrayList<>();
        for(int num : nums){
            digits(list, num);
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}