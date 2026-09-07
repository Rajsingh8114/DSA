class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int jumps = 0;
        int currEnd = 0;
        int maxReach = 0;

        // Process indices until second last.
        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            // End of current range => commit one jump.
            if (i == currEnd) {
                jumps++;
                currEnd = maxReach;

                // If this range already covers last index, stop.
                if (currEnd >= n - 1) break;
            }
        }

        return jumps;
    }
}