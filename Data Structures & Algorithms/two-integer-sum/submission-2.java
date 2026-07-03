class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i + 1; j < nums.length;j++){
        //         if (nums[i]+nums[j] == target){
        //             System.out.println("adding");
        //             result[0] = i;
        //             result[1] = j;
        //             System.out.println("adding");
        //         }
        //     }
        // }
        // return result;
        HashMap<Integer,Integer> numsHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (numsHash.containsKey(target - nums[i])){
                result[0] = numsHash.get(target - nums[i]);
                result[1] = i;
            }
            numsHash.put(nums[i],i);
        }
        return result;
    }
}
