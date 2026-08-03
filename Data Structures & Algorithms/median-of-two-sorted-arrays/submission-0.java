class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numbers = new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++ ){
            numbers[i] = nums1[i];
        }
        for (int j = nums1.length; j < numbers.length; j++ ){
            numbers[j] = nums2[(numbers.length-1) - j];
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length % 2);
        if (numbers.length % 2 != 0){
            int mid = numbers.length/2;
            return (double)numbers[mid];
        }else {
            int mid = numbers.length/2;
            return (double)(numbers[mid] + numbers[mid-1])/2;
        }
    }
}
