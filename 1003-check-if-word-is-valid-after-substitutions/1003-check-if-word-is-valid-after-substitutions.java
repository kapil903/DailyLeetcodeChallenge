class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for(char ch : s.toCharArray()){
            if(ch != 'c'){
                st.push(ch);
            }
            else{
                for(int i = 0; i < 2; i++){
                    if(!st.isEmpty() && ch == 'c' && st.peek() == 'b'){
                        st.pop();
                        ch = 'b';
                        flag = false;
                    }
                    else if(!st.isEmpty() && ch == 'b' && st.peek() == 'a'){
                        st.pop();
                        flag = true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty() && flag;
    }
}