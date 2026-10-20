
class Solution {
public:
    int characterReplacement(string s, int k) {
        vector<int> f(26, 0);

        int low = 0;
        int res = 0;
        int maxcount = 0;

        for (int high = 0; high < s.size(); high++) {
            f[s[high] - 'A']++;

            maxcount = max(maxcount, f[s[high] - 'A']);

            while ((high - low + 1) - maxcount > k) {
                f[s[low] - 'A']--;
                low++;
            }

            res = max(res, high - low + 1);
        }

        return res;
    }
};
