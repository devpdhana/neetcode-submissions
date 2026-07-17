class Solution {
    public int trap(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length -  1;
        int maxL = 0;
        int maxR = 0;
        int waterTrap = 0;
        while(leftPointer < rightPointer){
            maxL = Math.max(maxL, height[leftPointer]);
            maxR = Math.max(maxR, height[rightPointer]);
            if (maxL < maxR){
                //left move
                waterTrap += Math.min(maxL,maxR) - height[leftPointer];
                leftPointer+=1;
            }else {
                // right move
                waterTrap += Math.min(maxL,maxR) - height[rightPointer];
                rightPointer -=1;
            }
        }
        return waterTrap;
    }
}
