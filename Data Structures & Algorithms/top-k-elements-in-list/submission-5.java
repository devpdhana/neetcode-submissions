class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<int[]> resultValues = new ArrayList<>();
        HashMap<Integer, Integer> hashValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int wordCount = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    wordCount += 1;
                }
            }
            if (!hashValue.containsKey(nums[i])) {
                hashValue.put(nums[i], wordCount);
                // if ((hashValue.get(nums[i]) >= k) && (!resultValues.contains(nums[i]))) {
                //     resultValues.add(nums[i]);
                // }
            }
        }
        for (int mapKey : hashValue.keySet()){
            resultValues.add(new int[] {hashValue.get(mapKey),mapKey});
        }
        // System.out.println(hashValue);
        // System.out.println(resultValues);
        resultValues.sort((a,b)->b[0]-a[0]);
//         System.out.println(
//     resultValues.stream()
//                 .map(Arrays::toString)
//                 .toList()
// );
        int[] resultArr = new int[k];
        for (int m = 0; m < k; m++){
            resultArr[m] = resultValues.get(m)[1];
        }
        // for (int num : hashValue.keySet()) {
        //     if (hashValue.get(num) > k && ((!resultValues.contains(hashValue.get(num))))) {
        //         resultValues.add(num);
        //     } else {
        //         boolean isUnique = false;
        //         for (int number : hashValue.keySet()) {
        //             if (hashValue.get(number) == 1) {
        //                 isUnique = true;
        //             } else {
        //                 isUnique = false;
        //                 break;
        //             }
        //         }
        //         if (isUnique) {
        //             return nums;
        //         }
        //     }
        // }
        // System.out.println(hashValue);
        // System.out.println(resultValues);
        // int[] finalValues = new int[resultValues.size()];
        // for (int m = 0; m < resultValues.size(); m++) {
        //     finalValues[m] = resultValues.get(m);
        // }
        return resultArr;
    }
}
