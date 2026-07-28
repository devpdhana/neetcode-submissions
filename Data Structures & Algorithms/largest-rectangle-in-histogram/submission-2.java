class Solution {
    public int largestRectangleArea(int[] heights) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> values = new Stack<>();
        // int width = 0;
        int maxArea = 0;
        // System.out.println(Arrays.toString(nextSmaller(heights)));
        // System.out.println(Arrays.toString(previousSmaller(heights)));
        // int[] nse = nextSmaller(heights);
        // int[] pse = previousSmaller(heights);
        // for (int i = 0; i < heights.length; i++){
        //     maxArea = Math.max(maxArea, heights[i] * (nse[i] - pse[i] -1));
        // }
        for (int i = 0; i < heights.length; i++) {
            while (!values.isEmpty() && heights[values.peek()] > heights[i]) {
                int element = values.pop();
                int pse = values.isEmpty() ? -1 : values.peek();
                int nse = i;
                maxArea = Math.max(maxArea, heights[element] * (nse - pse - 1));
            }
            values.push(i);
        }
        while (!values.isEmpty()) {
            int element = values.pop();
            int nse = heights.length;
            int pse = !values.isEmpty() ? values.peek() : -1;
            maxArea = Math.max(maxArea, heights[element] * (nse - pse - 1));
        }
        return maxArea;
    }
    public int[] nextSmaller(int[] elements) {
        int[] smaller = new int[elements.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            while (!stack.isEmpty() && elements[stack.peek()] > elements[i]) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        for (int j = 0; j < elements.length; j++) {
            if (map.containsKey(j)) {
                smaller[j] = map.get(j);
            } else {
                smaller[j] = elements.length;
            }
        }
        return smaller;
    }
    public int[] previousSmaller(int[] elements) {
        int[] smaller = new int[elements.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = elements.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && elements[stack.peek()] > elements[i]) {
                map.put(stack.pop(), i); // elemnt - > psm
            }
            stack.push(i);
        }
        // System.out.println(map);
        for (int j = 0; j < elements.length; j++) {
            if (map.containsKey(j)) {
                smaller[j] = map.get(j);
            } else {
                smaller[j] = -1;
            }
        }
        return smaller;
    }
}