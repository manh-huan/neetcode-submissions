class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) +1);
            }
        }

        return map.entrySet().stream().filter(
            entry -> entry.getValue() > nums.length/2
        ).map(Map.Entry::getKey).collect(Collectors.toList()).get(0);


    }
}