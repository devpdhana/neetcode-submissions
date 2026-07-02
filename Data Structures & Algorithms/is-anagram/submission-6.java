class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        if (s.length() == t.length()) {
            HashMap<String, Integer> sWordCount = wordCount(s);
            HashMap<String, Integer> tWordCount = wordCount(t);
            for (String key : sWordCount.keySet()) {
                // System.out.println(sWordCount.get(key));
                // System.out.println(tWordCount.get(key));
                if ((sWordCount.containsKey(key) && tWordCount.containsKey(key))) {
                    if (sWordCount.get(key).intValue() == tWordCount.get(key).intValue()) {
                        isAnagram = true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            // for (int i = 0; i < s.length(); i++){
            //     if (t.contains(String.valueOf(s.charAt(i)))){
            //         isAnagram = true;
            //     }else {
            //         isAnagram =  false;
            //     }
            // }

            // System.out.println(letterCount);
        }
        return isAnagram;
    }
    public HashMap<String, Integer> wordCount(String s) {
        HashMap<String, Integer> letterCount = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!letterCount.containsKey(String.valueOf(s.charAt(i)))) {
                int wordCount = 1;
                for (int k = i + 1; k < s.length(); k++) {
                    // System.out.println("s.charAt(j) == s.charAt(k): " + (s.charAt(i) == s.charAt(k))
                        // + " s.charAt(j): " + s.charAt(i) + " s.charAt(k): " + s.charAt(k));
                    if (s.charAt(i) == s.charAt(k)) {
                        // System.out.println("matched");
                        wordCount += 1;
                        // System.out.println("wordCount " + wordCount);
                    }
                }
                // System.out.println("assigned " + String.valueOf(s.charAt(i)) + wordCount);
                letterCount.put(String.valueOf(s.charAt(i)), wordCount);
            }
        }
        return letterCount;
    }
}
