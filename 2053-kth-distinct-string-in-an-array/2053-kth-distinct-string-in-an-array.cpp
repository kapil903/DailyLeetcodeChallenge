class Solution {
public:
    string kthDistinct(vector<string>& nums, int k) {
        int n = nums.size();
        string temp ="";
        vector<string>ans;
        unordered_map<string , int>mp;
        for(int i =0; i<n ; i++){
            mp[nums[i]]++;
        }
        for(int i =0; i<n; i++){
            if(mp[nums[i]] == 1){
                ans.push_back(nums[i]);
            }
        }
        int count =0;
        for(int i =0; i<ans.size(); i++){
            count++;
            if(count ==k){
                temp = ans[i];
                break;
            }
        }
        return temp;
    }
};