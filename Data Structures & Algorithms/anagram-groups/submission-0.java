class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalResult = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            HashMap<Character,Integer> currentHash = frequencyCount(strs[i]);
            List<String> currentlist = new ArrayList<>();
            for (int j = 0; j < strs.length; j++){
                HashMap<Character,Integer> currentHashTwo = frequencyCount(strs[j]);
                if (currentHash.equals(currentHashTwo)){
                    currentlist.add(strs[j]);
                }
            }
            if (!finalResult.contains(currentlist)){
                finalResult.add(currentlist);
            }
        }
        return finalResult;
    }
    public HashMap<Character,Integer> frequencyCount(String str){
        HashMap<Character,Integer> currentHash = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            int wordCount = 1;
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    wordCount += 1;
                }
            }
            if (!currentHash.containsKey(str.charAt(i))){
                currentHash.put(str.charAt(i),wordCount);
            }
        }
        return currentHash;
    }
}
