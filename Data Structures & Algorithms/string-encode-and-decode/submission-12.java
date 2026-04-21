class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();
        List<Integer> sizeStrs;
        for(String s : strs) {
            output.append(s.length())
                .append(',');
        }
        output.append('#');
        for (String s : strs) {
            output.append(s);
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>(); 

        while (str.charAt(i) != '#') {
            StringBuilder size = new StringBuilder();
            while(str.charAt(i) != ',') {
                size.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(size.toString()));
            i++;
        }
        i++;
        for(int s : sizes) {
            res.add(str.substring(i, i+ s));
            i += s;
        }
        return res;
    }
}
