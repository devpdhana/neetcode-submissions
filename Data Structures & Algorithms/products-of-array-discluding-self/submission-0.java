class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0;i < nums.length; i++){
            int currentItem = 1;
            for (int j = 0; j < nums.length; j++){
                if (i != j){
                    currentItem = currentItem * nums[j];
                }
            }
            result[i] = (currentItem);
        }
        return result;
    }
}  
