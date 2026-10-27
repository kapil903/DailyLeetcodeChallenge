class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;
        int i = 0;
        int cntr = 0;
        while(i < s.length()){
            while(i < s.length() && cnt % 2 == 0){
                if(s.charAt(i) == '*'){
                    cntr++;
                }
                else if(s.charAt(i) == '|'){
                    cnt++;
                }
                i++;
            }
            while(i < s.length() && cnt % 2 != 0){
                if(s.charAt(i) == '|'){
                    cnt++;
                }
                i++;
            }
        }
        return cntr;
    }
}