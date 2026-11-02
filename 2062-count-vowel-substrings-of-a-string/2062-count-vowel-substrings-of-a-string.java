class Solution {
    boolean allVowels(String word, int i, int j){
        int cntA = 0;
        int cntE = 0;
        int cntI = 0;
        int cntO = 0;
        int cntU = 0;
        while(i <= j){
            char ch = word.charAt(i);
            if(ch == 'a') cntA++;
            else if(ch == 'e') cntE++;
            else if(ch == 'i') cntI++;
            else if(ch == 'o') cntO++;
            else if(ch == 'u') cntU++;
            else return false;
            i++;
        }
        return cntA >= 1 && cntE >= 1 && cntI >= 1 && cntO >= 1 && cntU >= 1;
    }
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int cnt = 0;
        for(int i = 0; i <= n - 5; i++){
            for(int j = i + 4; j < n; j++){
                if(allVowels(word, i, j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}