class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while (l < r) {
            if(maxArea < (r - l)*Math.min(heights[r], heights[l]))
                maxArea = (r - l)*Math.min(heights[r], heights[l]);
            if(heights[l] <= heights[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}
