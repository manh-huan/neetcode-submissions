class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //Optimize by stack
        Stack<int[]> tempStack = new Stack<>();
        int [] res = new int [temperatures.length];
        //Brute force solution 
        for(int i = 0; i < temperatures.length ; i++){
            int t = temperatures[i];
            while(!tempStack.empty() && t > tempStack.peek()[0]) {
                res[tempStack.peek()[1]] = i - tempStack.peek()[1];
                tempStack.pop();
            }
            tempStack.push(new int[] {t,i});
        }
        return res;
    }
}
