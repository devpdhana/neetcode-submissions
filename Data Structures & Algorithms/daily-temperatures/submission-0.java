class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> values = new Stack<>();
        int[] newOne = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
                int count = 0; 
            for (int j = i+1; j < temperatures.length; j++){
                System.out.print("nums");
                System.out.println(temperatures[i]);
                System.out.println(temperatures[j]);
                if (temperatures[i] < temperatures[j]){
                    count+=1;
                    break;
                }else if (j != temperatures.length -1){
                    count+=1;
                }else if (j == temperatures.length -1){
                    count = 0;
                }
            }
            newOne[i] = count;
        }
        return newOne;
    }
}
