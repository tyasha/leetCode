class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i;
        if (nums.length % 2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        for (; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}