class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // Step 1: Create a list of cars with position and time to reach target
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i]; // position
            cars[i][1] = (double)(target - position[i]) / speed[i]; // time
        }

        // Step 2: Sort cars by position descending
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack <>();

        for(int i = 0; i < n ; i ++) {
            if(stack.empty() || stack.peek() < cars[i][1])
                stack.push(cars[i][1]);
        }
        return stack.size();
    }
}
