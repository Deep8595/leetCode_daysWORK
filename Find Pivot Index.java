724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int total= 0 , n = nums.length , left = 0; 
        for( int i = 0 ; i < n ; i++ ){
            total += nums[i];
        }

        for( int j = 0 ; j < n ; j++){
            int right = total - left - nums[j];
            if( left ==  right ){
                return j;
            }
            left += nums[j];
        }
        return -1;
    }
}
