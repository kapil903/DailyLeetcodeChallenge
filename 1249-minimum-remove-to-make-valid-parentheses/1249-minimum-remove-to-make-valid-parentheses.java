class Solution {
    public String minRemoveToMakeValid(String s) {
        int i = 0;
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int[] vis = new int[n];
        int prev = 0;
        while(i < n){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else if(ch == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    vis[i] = 1;
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            vis[st.pop()] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n; j++){
            if(vis[j] == 0){
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
}