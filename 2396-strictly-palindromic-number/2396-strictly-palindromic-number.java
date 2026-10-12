class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n - 2; i++) {
            int num = n;
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                sb.append(num % i);
                num /= i;
            }
            String str = sb.toString();
            if (!str.equals(sb.reverse().toString())) {
                return false;
            }
        }
        return true;
    }
}