class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        // [2,7,11,15]
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i =0; i <nums.length; i++){
            int lookupNumber = target - nums[i];

            if(map.containsKey(lookupNumber)&& map.get(lookupNumber) !=i){
                return new int[]{
                    map.get(lookupNumber),
                    i
                };
            }
        }

        return new int[] {-1, -1};
   
    }
}