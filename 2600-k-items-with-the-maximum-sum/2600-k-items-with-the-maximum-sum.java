class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        while(numOnes > 0 && k > 0){
            sum += 1;
            k--;
            numOnes--;
        }
        while(numZeros > 0 && k > 0){
            k--;
            numZeros--;
        }
        while(numNegOnes > 0 && k > 0){
            sum -= 1;
            k--;
            numNegOnes--;
        }
        return sum;
    }
}