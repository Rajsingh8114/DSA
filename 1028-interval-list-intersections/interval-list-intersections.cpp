
class Solution {
public:
    vector<vector<int>> intervalIntersection(
        vector<vector<int>>& firstList,
        vector<vector<int>>& secondList) {

        vector<vector<int>> res;

        int n = firstList.size();
        int m = secondList.size();

        int i = 0, j = 0;

        for (; i < n && j < m; ) {

            int start1 = firstList[i][0];
            int end1 = firstList[i][1];

            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            // Find intersection
            int start = max(start1, start2);
            int end = min(end1, end2);

            if (start <= end) {
                res.push_back({start, end});
            }

            // Move pointer
            if (end1 <= end2) {
                i++;
            }
            else {
                j++;
            }
        }

        return res;
    }
};
