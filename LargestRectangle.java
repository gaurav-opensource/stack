import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || heights[i] < heights[st.peek()])) {
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : (i - st.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
