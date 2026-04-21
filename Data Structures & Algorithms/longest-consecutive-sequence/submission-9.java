class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);
        int curr = nums[0];
        int k = 1;
        int result = 1;
        for(int i = 1; i < nums.length; i++) {
            if(curr == nums[i]) {
                continue;
            }
            if(curr == nums[i]-1) {
                k ++;
            } else {
                k  = 1;
            } 
            result = Math.max(result,k);
            curr = nums[i];
        }
        return result; 
    }
}
