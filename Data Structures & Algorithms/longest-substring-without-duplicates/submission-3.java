class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> pool = new HashSet<>();
        int result = 0;
        int l = 0;
        for(int r = 0; r < s.length() ; r ++) {    
            while(pool.contains(s.charAt(r))) {
                pool.remove(s.charAt(l));
                l++;
            }
            pool.add(s.charAt(r));
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
