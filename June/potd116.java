
class Solution {
    public int maximumDifference(int[] nums) {
        int xMin = nums[0];
        int maxD = -1;    // This will store the largest difference between a later number and a smaller earlier number. If no such pair is found (i.e., the array is non-increasing), the return value remains -1.
        

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x <= xMin) {
                xMin = x;
            } else {
                maxD = Math.max(maxD, x - xMin);
            }
        }

        return maxD;
    }
}
