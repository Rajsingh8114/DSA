class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int n=fruits.size();
        unordered_map<int,int>mpp;
        int i=0;
        int maxLen=0;
        for(int j=0;j<n;j++){
            mpp[fruits[j]]++;
            if(mpp.size()>2){
               mpp[fruits[i]]--;
               if(mpp[fruits[i]]==0) mpp.erase(fruits[i]);
               i++;
            }
            if(mpp.size()<=2){
                maxLen=max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
};