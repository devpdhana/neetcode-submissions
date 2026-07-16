class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> values = new ArrayList<>();
        for (int i = 0; i < nums.length;i++){
            for (int j = i+1; j < nums.length;j++){
                for (int k = j+1; k < nums.length;k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        ArrayList<Integer> currentList = new ArrayList<Integer>();
                        currentList.add(nums[i]);
                        currentList.add(nums[j]);
                        currentList.add(nums[k]);
                        currentList.sort((a,b)-> a.compareTo(b));
                        if (!values.contains(currentList)){
                            values.add(currentList);
                        }
                    }
                }
            }
        }
        return values;
    }
}
