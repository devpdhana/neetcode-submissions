class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();
        boolean isMatch = false;
        if (s1.length()>s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!s1Map.containsKey(s1.charAt(i))) {
                s1Map.put(s1.charAt(i), 0);
            }
            int current = s1Map.get(s1.charAt(i));
            s1Map.put(s1.charAt(i), current += 1);
        }
        int window = s1.length() - 1;
        for (int j = 0; j <= window; j++) {
            if (!s2Map.containsKey(s2.charAt(j))) {
                s2Map.put(s2.charAt(j), 0);
            }
            int current = s2Map.get(s2.charAt(j));
            s2Map.put(s2.charAt(j), current += 1);
        }
        System.out.println(s1Map);
        System.out.println(s2Map);
        if (s1Map.equals(s2Map)) {
            return true;
        }
        int left = 0;
        int right = window;
        System.out.println("outer right");
        System.out.println(right);
        while (right < s2.length() - 1) {
            int outGoing = s2Map.get(s2.charAt(left)) - 1;
            if (outGoing == 0) {
                s2Map.remove(s2.charAt(left));
            } else {
                s2Map.put(s2.charAt(left), outGoing);
            }
            left += 1;
            right += 1;
            if (!s2Map.containsKey(s2.charAt(right))) {
                s2Map.put(s2.charAt(right), 1);
            } else {
                int inComing = s2Map.get(s2.charAt(right)) + 1;
                s2Map.put(s2.charAt(right), inComing);
            }
            System.out.println(s1Map);
            System.out.println(s2Map);
            if (s1Map.equals(s2Map)) {
                return true;
            }
        }
        return false;
    }
}
