class Solution {
    public boolean isPalindrome(String s) {
        int leftSide = 0;
        int rightSide = s.length() - 1;
        while (leftSide < rightSide) {
            if (Character.isLetter(s.charAt(leftSide))) {
                if (Character.isLetter(s.charAt(rightSide))) {
                    if (Character.toLowerCase(s.charAt(leftSide)) == Character.toLowerCase(s.charAt(rightSide))) {
                        leftSide += 1;
                        rightSide -= 1;
                    } else {
                        return false;
                    }
                }else if (!Character.isLetterOrDigit(s.charAt(rightSide))){
                    rightSide-=1;
                }else {
                    return false;
                }
            }else if (Character.isDigit(s.charAt(leftSide))){
                if (Character.isDigit(s.charAt(rightSide))) {
                    if (s.charAt(leftSide) == s.charAt(rightSide)) {
                        leftSide += 1;
                        rightSide -= 1;
                    } else {
                        return false;
                    }
                }else if (!Character.isLetterOrDigit(s.charAt(rightSide))){
                    rightSide-=1;
                }else {
                    return false;
                }
            }else if (!Character.isLetterOrDigit(s.charAt(leftSide))) {
                leftSide += 1;
            }else {
                return false;
            }
        }
        return true;
    }
}
