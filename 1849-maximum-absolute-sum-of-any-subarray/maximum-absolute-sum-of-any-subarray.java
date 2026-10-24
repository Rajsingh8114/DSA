
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = 0;
        int minEnding = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            maxEnding = Math.max(0, maxEnding + nums[i]);
            minEnding = Math.min(0, minEnding + nums[i]);

            ans = Math.max(ans, Math.max(maxEnding, -minEnding));
        }

        return ans;
    }
}
