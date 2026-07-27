class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> mapp = new HashMap<>();
        mapp.put(')','(');
        mapp.put('}', '{');
        mapp.put(']','[');

        for (int i = 0; i < s.length(); i++) {
            Character chr = s.charAt(i);
            if (chr == '(' || chr == '{' || chr == '[') {
                stack.push(chr);
            }
            else{
                if(!stack.empty()){
                    if(stack.peek()!=mapp.get(chr)){
                        stack.pop();
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                    
                }
                else{
                    return false;
                }
            }
            
        }
        return stack.empty();
    }
}
