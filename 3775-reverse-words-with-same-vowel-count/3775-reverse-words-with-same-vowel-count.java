class Solution {
    int vowelCount(String s){
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') cnt++;
        }
        return cnt;
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            int cnt = vowelCount(str);
            if(set.isEmpty()){
                sb.append(str);
                set.add(cnt);
            }
            else if(set.contains(cnt)){
                StringBuilder sb1 = new StringBuilder(str);
                sb.append(sb1.reverse());
            }else{
                sb.append(str);
            }
            if(i != arr.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}