class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> values = new Stack<>();
        int sum = 0;
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].matches("-?\\d+")){
                values.push(Integer.parseInt(tokens[i]));
                System.out.println("values");
                System.out.println(values);
            }else if (tokens[i].equals("+")){
                        int two = values.pop();
                        int one = values.pop();
                        values.push(two+one);
                    }else if (tokens[i].equals("-")){
                        int two = values.pop();
                        int one = values.pop();
                        values.push(one-two);
                    }else if (tokens[i].equals("*")){
                        int two = values.pop();
                        int one = values.pop();
                        values.push(one*two);
                        
                    }else if (tokens[i].equals("/")){
                        int two = values.pop();
                        int one = values.pop();
                        values.push(one/two);
                    }
        }
        return values.peek();
    }
}
