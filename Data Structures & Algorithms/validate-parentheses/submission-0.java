class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> validBracket = new HashMap<> ();
        validBracket.put(')', '(');
        validBracket.put('}', '{');
        validBracket.put(']', '[');

        Stack <Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(validBracket.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == validBracket.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
