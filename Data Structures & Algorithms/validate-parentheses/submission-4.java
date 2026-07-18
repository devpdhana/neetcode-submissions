class Solution {
    public boolean isValid(String s) {
        Stack<Character> values = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                values.push(')');
            } else if (s.charAt(i) == ')') {
                if (values.isEmpty() || values.pop() != ')'){
                    return false;
                }
            } else if (s.charAt(i) == '{') {
                values.push('}');

            } else if (s.charAt(i) == '}') {
                if (values.isEmpty() || values.pop() != '}'){
                    return false;
                }
            } else if (s.charAt(i) == '[') {
                values.push(']');

            } else if (s.charAt(i) == ']') {
                if (values.isEmpty() || values.pop() != ']'){
                    return false;
                }
            }
        }
        if (values.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
