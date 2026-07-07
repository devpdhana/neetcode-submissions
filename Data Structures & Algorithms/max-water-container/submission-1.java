class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++){
            int breath = 1;
            for (int j = i+1; j < heights.length; j++){
                if (heights[i]< heights[j]){
                    if (max < heights[i] * breath){
                        max = heights[i] * breath;
                    }
                }else {
                    if (max < heights[j] * breath){
                        max = heights[j] * breath;
                    }
                }
                breath += 1;
            }
        }
        return max;
    }
}
