class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch1 : order.toCharArray()){
            for(char ch2 : s.toCharArray()){
                if(ch1 == ch2){
                    sb.append(ch1);
                }
            }
        }
        for(char ch : s.toCharArray()){
            if(order.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}