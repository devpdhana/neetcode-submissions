class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        // for (int i = 0; i < heights.length; i++){
        //     int breath = 1;
        //     for (int j = i+1; j < heights.length; j++){
        //         if (heights[i]< heights[j]){
        //             if (max < heights[i] * breath){
        //                 max = heights[i] * breath;
        //             }
        //         }else {
        //             if (max < heights[j] * breath){
        //                 max = heights[j] * breath;
        //             }
        //         }
        //         breath += 1;
        //     }
        // }
        // return max;
        int leftSide = 0;
        int rightSide = heights.length -1;
        while (leftSide < rightSide){
            if (heights[leftSide]< heights[rightSide]){
                if (max< heights[leftSide] * (rightSide -leftSide)){
                    System.out.println("(rightSide -leftSide)");
                    System.out.println(rightSide -leftSide);
                    System.out.println(heights[leftSide]);
                    max = heights[leftSide] * (rightSide -leftSide);
                    System.out.println((rightSide -leftSide));
                }
                leftSide+=1;
            }else {
                if (max< heights[rightSide] * (Math.max(leftSide,rightSide) - Math.min(leftSide,rightSide))){
                    max = heights[rightSide] * (Math.max(leftSide,rightSide) - Math.min(leftSide,rightSide));
                    System.out.println(max);
                }
                rightSide-=1;
            }
        }
        return max;
    }
}
