class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int[] numbers = new int[nums1.length+nums2.length];
        // for (int i = 0; i < nums1.length; i++ ){
        //     numbers[i] = nums1[i];
        // }
        // for (int j = nums1.length; j < numbers.length; j++ ){
        //     numbers[j] = nums2[(numbers.length-1) - j];
        // }
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        // System.out.println(numbers.length % 2);
        // if (numbers.length % 2 != 0){
        //     int mid = numbers.length/2;
        //     return (double)numbers[mid];
        // }else {
        //     int mid = numbers.length/2;
        //     return (double)(numbers[mid] + numbers[mid-1])/2;
        // }
        int[] minArray = nums1.length <= nums2.length ? nums1 : nums2;
        int[] maxArray = nums1.length > nums2.length ? nums1 : nums2;
        int total = minArray.length + maxArray.length;
        int left = 0;
        int right = minArray.length;
           System.out.println(Arrays.toString(minArray));
System.out.println(Arrays.toString(maxArray));
            System.out.println(total);
        while (left <= right){
            int mid1 = (left + right ) / 2;
            int mid2 = ((minArray.length +maxArray.length +1)/2) - mid1;
            int leftOne = Integer.MIN_VALUE;
            int leftTwo = Integer.MIN_VALUE;
            int rightOne = Integer.MAX_VALUE;
            int rightTwo = Integer.MAX_VALUE;
            
            if (mid1 < minArray.length){
                rightOne = minArray[mid1];
            }
            if (mid2 < maxArray.length){
                rightTwo = maxArray[mid2];
            }
            if (mid1 - 1 >= 0){
                leftOne = minArray[mid1-1];
            }
            if (mid2 - 1 >= 0){
                leftTwo = maxArray[mid2-1];
            }
            System.out.println("mid1 = " + mid1);
System.out.println("mid2 = " + mid2);

System.out.println("leftOne  = " + leftOne);
System.out.println("rightOne = " + rightOne);
System.out.println("leftTwo  = " + leftTwo);
System.out.println("rightTwo = " + rightTwo);
            if (leftOne <= rightTwo && leftTwo <= rightOne){
                if (total % 2 == 1){
                    return Math.max(leftOne,leftTwo);
                }else {
                    return (double)(Math.max(leftOne,leftTwo) + Math.min(rightOne,rightTwo))/2.0;
                }
            }else if (leftOne > rightTwo){
                right = mid1 -1;
            }else {
                left = mid1 +1;
            }

        }
        return 0;
    }
}
