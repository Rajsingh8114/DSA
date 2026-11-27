
import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        // Step 1: Store all intervals
        ArrayList<int[]> arr = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            arr.add(intervals[i]);
        }

        // Insert new interval
        arr.add(newInterval);

        // Step 2: Sort according to starting point
        arr.sort((a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Merge intervals
        ArrayList<int[]> res = new ArrayList<>();

        int start1 = arr.get(0)[0];
        int end1 = arr.get(0)[1];

        for (int i = 1; i < arr.size(); i++) {

            int start2 = arr.get(i)[0];
            int end2 = arr.get(i)[1];

            if (end1 >= start2) {

                end1 = Math.max(end1, end2);

            } else {

                res.add(new int[]{start1, end1});

                start1 = start2;
                end1 = end2;
            }
        }

        // Add last interval
        res.add(new int[]{start1, end1});

        return res.toArray(new int[res.size()][]);
    }
}
