class Solution {
    public long dividePlayers(int[] skill) {
        long sum = 0;
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length - 1;
        int orgSum = skill[i] + skill[j];
        while(i < j){
            if(skill[i] + skill[j] != orgSum){
                return -1;
            }
            sum += (long) skill[i] * skill[j];
            i++;
            j--;
        }
        return sum;
    }
}