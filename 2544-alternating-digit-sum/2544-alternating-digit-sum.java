class Solution {
    int cntDigits(int n){
        int cnt = 0;
        while(n > 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    public int alternateDigitSum(int n) {
        int sum = 0;
        int cnt = cntDigits(n);
        boolean pos = true;
        if(cnt % 2 == 0) pos = false;
        while(n > 0){
            int digit = n % 10;
            if(pos){
                sum += digit;
                pos = false;
            }else{
                sum -= digit;
                pos = true;
            }
            n /= 10;
        }
        return sum;
    }
}