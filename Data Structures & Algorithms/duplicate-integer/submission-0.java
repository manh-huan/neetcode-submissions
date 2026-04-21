class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkSet = new HashSet<>();
        for(int i : nums) {
            if(checkSet.contains(i))
                return true;
            else 
                checkSet.add(i);
        }
        return false;
    }
}
