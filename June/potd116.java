
class Solution {
    public int maximumDifference(int[] nums) {
        int xMin = nums[0];
        int maxD = -1;

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
