class Solution {
    public int numberOfBeams(String[] bank) {
        int cntr = 0;
        int n = bank.length;
        int[] device = new int[n];
        for(int i = 0; i < n; i++){
            String str = bank[i];
            int cnt = 0;
            for(char ch : str.toCharArray()){
                if(ch == '1'){
                    cnt++;
                }
            }
            device[i] = cnt;
            if(cnt > 0) cntr++;
        }
        if(cntr <= 1) return 0;
        int i = 0;
        int beams = 0;
        while(device[i] == 0){
            i++;
        }
        int prev = device[i++];
        while(i < n){
            if(device[i] != 0){
                beams += prev * device[i];
                prev = device[i];
            }
            i++;
        }
        return beams;
    }
}