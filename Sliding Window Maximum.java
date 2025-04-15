class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0]; 
        int wind = n - k + 1;  
        int arr[] = new int[wind], count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
        }
        arr[count++] = max; 
        for (int i = k; i < n; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else if (nums[i - k] == max) {
                max = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    max = Math.max(max, nums[j]);
                }
            }
            arr[count++] = max;
        }
        return arr;
    }
}
