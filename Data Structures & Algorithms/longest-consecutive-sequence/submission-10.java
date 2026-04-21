class Solution {
    public int longestConsecutive(int[] nums) {

      
        if(nums.length == 0)
            return 0;

        Set<Integer> pool = new HashSet<>();

        for(int i :  nums) {
            pool.add(i);
        }
      
        int result = 0;
        for(int i : nums) {
            int streak = 0;
            int curr = i;
            while(pool.contains(curr)) {
                streak++;
                curr++;
            }
            result = Math.max(result, streak);
        }
        return result; 
    }
}
