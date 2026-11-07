class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(String s : details){
            String age = s.substring(11, 13);
            int num = Integer.parseInt(age);
            if(num > 60){
                cnt++;
            }
        }
        return cnt;
    }
}