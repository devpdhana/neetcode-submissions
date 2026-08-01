class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        // for (int i = 0; i < nums.length; i++){
        //     if (nums[i]< min){
        //         min = nums[i];
        //     }
        // }
        // return min;
        int left = 0;
        int right  = nums.length -1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[left] <= nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid + 1;
            }else {
                right = mid-1;
                min = Math.min(min,nums[mid]);
            }
        }
        return min;
    }
}
