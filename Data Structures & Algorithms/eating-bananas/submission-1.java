class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = (l+r)/2;

            long timeToEat = 0;

            for(int i : piles) {
                timeToEat += Math.ceil((double) i/k );
            }

            if(timeToEat <= h) {
                res = k;
                r = k -1;
            } else {
                l = k +1;
            }

        }
        return res;
       
    }
}
