class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length ; i ++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i -1 ] ) continue;
            int l = i +1;
            int r = nums.length - 1;
            int diff = 0 - nums[i];
            while (l < r)
                if(nums[l] + nums[r] > diff) 
                   r--;
                else if (nums[l] + nums[r] < diff) 
                    l++;
                else {
                    res.add(Arrays.asList(nums[i], nums [l], nums [r]));
                    l++;
                    r--;   
                    while (l < r && nums[r] == nums[r+1])
                        r --;
                }          
        }
        return res;
    }
}
