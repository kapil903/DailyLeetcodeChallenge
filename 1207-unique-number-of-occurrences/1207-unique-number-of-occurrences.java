class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int num : arr){
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : mpp.keySet()){
            int val = mpp.get(num);
            if(set.contains(val)) return false;
            set.add(val);
        }
        return true;
    }
}