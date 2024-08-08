class Solution {
    public int findNumbers(int[] nums) {
        int evenNumbers = 0;
        for(int number : nums) {
            String n = String.valueOf(number);
            if(n.length() % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
}