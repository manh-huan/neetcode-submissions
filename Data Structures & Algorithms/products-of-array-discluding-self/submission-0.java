class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int [] leftProduct = new int[nums.length];
        int [] rightProduct = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i == 0)
                leftProduct[0] = 1;
            else 
                leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }

        for(int i = nums.length-1; i >= 0; i--) {
            if(i == nums.length -1)
                rightProduct[nums.length-1] = 1;
            else 
                rightProduct[i] = rightProduct[i+1]*nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            res[i] = leftProduct[i]*rightProduct[i];
        }

        return res;
    }
}  
