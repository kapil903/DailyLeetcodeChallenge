class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String str : words){
            Map<Character, Character> mpp1 = new HashMap<>();
            Map<Character, Character> mpp2 = new HashMap<>();
            if(pattern.length() == str.length()){
                int i = 0;
                boolean flag = true;
                while(i < str.length()){
                    char ch1 = pattern.charAt(i);
                    char ch2 = str.charAt(i);
                    if(mpp1.size() == 0 || !mpp1.containsKey(ch1) && !mpp2.containsKey(ch2)){
                        mpp1.put(ch1, ch2);
                        mpp2.put(ch2, ch1);
                    }
                    else if(mpp1.containsKey(ch1) && mpp1.get(ch1) != ch2 || mpp2.containsKey(ch2) && mpp2.get(ch2) != ch1){
                        flag = false;
                        break;
                    }
                    i++;
                }
                if(flag){
                    ans.add(str);
                }
            }
        }
        return ans;
    }
}