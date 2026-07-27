class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        HashMap<Integer,Double> times = new HashMap<>();
        for (int i = 0; i < position.length; i++){
            times.put(position[i],(double)(target - position[i])/speed[i]);
        }
        Arrays.sort(position);
        for (int i = position.length -1; i >= 0; i--){
            if (!stack.isEmpty() && (stack.peek() >= times.get(position[i]))){
                // System.out.println("First if");
                // System.out.print(times.get(position[i]));
                // System.out.println(stack);
                continue;
            }else if (!stack.isEmpty() && stack.peek() < times.get(position[i])){
                // System.out.println("2nd if");
                // System.out.print(times.get(position[i]));
                // System.out.println(stack);
                stack.push(times.get(position[i]));
            }else {
                // System.out.println("else");
                stack.push(times.get(position[i]));
                // System.out.println(stack);
            }
        }
        // System.out.println(times);
        return stack.size();
    }
}
