class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                // left side sorted
                if (nums[left] <= target && nums[mid] >= target) {
                    int innerMid = (left + mid) / 2;
                    if (nums[innerMid] == target) {
                        return innerMid;
                    } else if (target > nums[innerMid]) {
                        left = mid + 1;
                    } else if (target < nums[innerMid]) {
                        right = mid - 1;
                    }
                } else {
                    System.out.println("second");
                    if (nums[left] == target) {
                        return left;
                    } else {
                        left += 1;
                    }
                }
            } else {
                // left = mid +1;
                // mid = (left + right)/2;
                // if (target == nums[mid]){
                //     return mid;
                // }else if (target < nums[mid]){
                //     left = mid + 1;

                // }else if (target > nums[mid]){
                //     right = mid -1;
                // }
                System.out.println("second");
                if (nums[left] == target) {
                    return left;
                } else {
                    left += 1;
                }
            }
        }
        return -1;
    }
}
