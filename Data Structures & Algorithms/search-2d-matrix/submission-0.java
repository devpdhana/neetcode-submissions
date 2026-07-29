class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        System.out.println(matrix.length);
        int outerLeft = 0;
        int outerRight = matrix.length - 1;
        while (outerLeft <= outerRight) {
            int outerMid = (outerLeft + outerRight) / 2;
            int[] midArray = matrix[outerMid];
            int innerLeft = 0;
            int innerRight = midArray.length - 1;
            if (target >= midArray[innerLeft] && target <= midArray[innerRight]) {
                while (innerLeft <= innerRight) {
                    int innerMid = (innerLeft + innerRight) / 2;
                    if (target == midArray[innerMid]) {
                        return true;
                    } else if (target < midArray[innerMid]) {
                        innerRight = innerMid - 1;
                    } else if (target > midArray[innerMid]) {
                        innerLeft = innerMid + 1;
                    }
                }
                return false;
            }
            if (target < midArray[0]) {
                outerRight = outerMid - 1;
            } else if (target > midArray[midArray.length - 1]) {
                outerLeft = outerMid + 1;
            }
        }
        return false;
    }
}
