class Solution {
    public int shortestSubarray(int[] nums, int k) {
        if (nums.length == 0 || k < 0) {
            return 0;
        }
        int s = 0, e = nums.length;

        while (s < nums.length) {
            int sum = 0;
            while (s < e) {
                sum = (nums[s] + nums[e]);
                if (sum == k) {
                    return k;
                }
                s++;
            }
            e++;

        }
        return -1;
    }
}
