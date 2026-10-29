class Solution {
    public int maxDistinct(String s) {
        int[] vis = new int[26];
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(vis[ch - 'a'] == 0){
                cnt++;
            }
            vis[ch - 'a']++;
        }
        return cnt;
    }
}