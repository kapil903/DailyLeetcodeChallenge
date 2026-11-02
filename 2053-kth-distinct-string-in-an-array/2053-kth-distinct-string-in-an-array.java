class Solution {
    public String kthDistinct(String[] arr, int k) {
        int min = arr.length;
        Map<String, Integer> mpp = new HashMap<>();
        for(String str : arr){
            mpp.put(str, mpp.getOrDefault(str, 0) + 1);
        }
        int cnt = 0;
        for(String str : arr){
            if(mpp.get(str) == 1){
                cnt++;
                if(cnt == k) return str;
            }
        }
        return "";
    }
}