class Solution {
    public void moveZeroes(int[] nums) {
        // [0,1,0,3,12]
        // [1,3,12,0,0]

        int j = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums [i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while( j < nums.length){
            nums[j] = 0;
            j++;
        }
    }
}