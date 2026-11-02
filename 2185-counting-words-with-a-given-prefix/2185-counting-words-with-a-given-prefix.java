class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for(String str : words){
            if(str.indexOf(pref) == 0) cnt++;
        }
        return cnt;
    }
}