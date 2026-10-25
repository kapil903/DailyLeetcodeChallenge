class Solution {
    public int compress(char[] chars) {
        char prev = chars[0];
        int pre = 0;
        int ind = 0;
        while (pre < chars.length) {
            int temp = pre + 1;
            int cnt = 1;
            while (temp < chars.length && chars[temp] == prev) {
                cnt++;
                temp++;
            }
            chars[ind++] = prev;
            if (cnt > 1) {
                String value = String.valueOf(cnt);
                for (int i = 0; i < value.length(); i++) {
                    chars[ind++] = value.charAt(i);
                }
            }
            pre = temp;
            if (pre < chars.length) {
                prev = chars[pre];
            }
        }
        return ind;
    }
}