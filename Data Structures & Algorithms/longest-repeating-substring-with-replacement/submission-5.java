class Solution {
    public int characterReplacement(String s, int k) {
        int leftPointer = 0;
        int rightPointer = leftPointer;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxOccurence = 0;
        // for (int i = 0; i < s.length(); i++){
        //     HashMap<Character, Integer> map = new HashMap<>();
        //     int maxOccurence = 0;
        //     for (int j = i; j < s.length(); j++){
        //         if (!map.containsKey(s.charAt(j))){
        //             map.put(s.charAt(j), 0);
        //         }
        //         int currentValue = map.get(s.charAt(j));
        //         map.put(s.charAt(j), currentValue+=1);
        //         maxOccurence = Math.max(maxOccurence, map.get(s.charAt(j)));
        //         // System.out.println(currentValue);
        //         // System.out.println(maxOccurence);
        //         int needChanges = (j - i + 1) - maxOccurence;
        //         if (needChanges <= k){
        //             maxLength = Math.max(maxLength, (j - i + 1));
        //         }else {
        //             break;
        //         }
        //     }
        // }
        // return maxLength;
        while (rightPointer < s.length()){
            if (!map.containsKey(s.charAt(rightPointer))){
                map.put(s.charAt(rightPointer),0);
            }
            int currentvalue = map.get(s.charAt(rightPointer));
            map.put(s.charAt(rightPointer), currentvalue+=1);
            maxOccurence = Math.max(maxOccurence, map.get(s.charAt(rightPointer)));
            if (((rightPointer - leftPointer + 1) - maxOccurence) > k){
                int value = map.get(s.charAt(leftPointer));
                map.put(s.charAt(leftPointer), value-=1);
                maxOccurence = 0;
                leftPointer+=1;
            }
            if ((rightPointer - leftPointer + 1) - maxOccurence <= k){
                maxLength = Math.max(maxLength, (rightPointer - leftPointer + 1));
            }
            rightPointer+=1;
        }
        return maxLength;
    }
}
