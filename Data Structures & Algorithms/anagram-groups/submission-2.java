class Solution {
           public List<List<String>> groupAnagrams(String[] strs) {

        HashMap < String, List<String>> map = new HashMap<>();
        Arrays.stream(strs).forEach((s -> {
            char[] charArrays = s.toCharArray();
            Arrays.sort(charArrays);
            String key = new String(charArrays);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }));
        return map.values().stream().toList();
    }
}
