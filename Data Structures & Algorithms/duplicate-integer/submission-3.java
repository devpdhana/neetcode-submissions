class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        boolean finalAns = false;
        for (int num : nums){
            if(numbers.add(num)){
                finalAns = false;
            }else {
                finalAns = true;
                return finalAns;
            }
        }
        return finalAns;
    }
}