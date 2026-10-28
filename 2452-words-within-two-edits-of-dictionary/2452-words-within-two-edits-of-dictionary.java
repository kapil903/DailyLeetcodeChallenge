class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n = queries[0].length();
        List<String> list = new ArrayList<>();
        for(String str : queries){
            for(String s : dictionary){
                int cnt = 0;
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == str.charAt(i)){
                        cnt++;
                    }
                }
                if(cnt >= n - 2){
                    list.add(str);
                    break;
                }
            }
        }
        return list;
    }
}