class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int ind = 0;
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ind < spaces.length && cnt == spaces[ind]){
                sb.append(" ");
                ind++;
            }
            sb.append(ch);
            cnt++;
        }
        return sb.toString();
    }
}