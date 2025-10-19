class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int difference = target;
    
        for (int i = 0; i < length; i++) {
            difference = target - nums[i];

            for (int j = i + 1; j < length; j++) { 
                if (nums[j] == difference) {
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {0, 0};
    }
}