class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLength = Integer.min(i - left + 1, minLength);
                sum -= nums[left++];
            }
        }
        if(minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}