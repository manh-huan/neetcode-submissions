class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        while(l <= r) {
            int p = l + ((r - l) / 2);
            if(nums[p] < target) {
                l = p + 1;
            } else if (nums[p] > target) {
                r = p - 1;
            } else {
                return p;
            }
        }
        return -1;
    }
}
