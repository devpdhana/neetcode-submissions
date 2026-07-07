class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int max = 0;
        for (int num : set){
            if (!set.contains(num-1)){
                int currentCount = 1;
                int element = num+1;
                while(set.contains(element)){
                    currentCount+=1;
                    element +=1;
                }
                if (max < currentCount){
                    max = currentCount;
                }
            }
        }
        return max;
    }
}
