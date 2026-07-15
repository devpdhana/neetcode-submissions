class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] values = new int[2];
        // for (int i = 0; i < numbers.length; i++){
        //     for (int j = i+1; j < numbers.length; j++){
        //         if (numbers[i]+numbers[j] == target){
        //             values[0] = i+1;
        //             values[1] = j+1;
        //         }
        //     }
        // }
        int leftSide = 0;
        int rightSide = numbers.length - 1;
        while (leftSide < rightSide){
            if (numbers[leftSide] + numbers[rightSide] == target){
                values[0] = leftSide+1;
                values[1] = rightSide+1;
                break;
            }else if (numbers[leftSide] + numbers[rightSide] >= target) {
                rightSide -=1;
            }else if (numbers[leftSide] + numbers[rightSide] <= target){
                leftSide +=1;
            }
        }
        return values;
    }
}
