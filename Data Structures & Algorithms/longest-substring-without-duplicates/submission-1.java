class Solution {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        if (s == null) {
            return 0;
        }
        for(int i = 0; i < s.length() ; i++) {
            Set<Character> pool = new HashSet<>();
            int k = i+1;
            pool.add(s.charAt(i));
            while(k < s.length()) {
                    if(pool.add(s.charAt(k)))
                        k++;
                    else 
                        break;  
            } 
            result = Math.max(result, k - i);
        }
        return result;
    }
}
