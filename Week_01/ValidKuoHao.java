public class ValidKuoHao {
    //1.不使用hash
    public boolean isValid(String str) {
        if(str==null){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char s:str.toCharArray()){
            if(s=='('){
                stack.push(')');
            }else if(s=='{'){
                stack.push('}');
            }else if(s=='['){
                stack.push(']');
            }else if(stack.isEmpty()||s!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
    //2.使用hash
    class Solution1 {
        public boolean isValid(String s) {
            int n = s.length();
            if (n % 2 == 1) {
                return false;
            }

            Map<Character, Character> pairs = new HashMap<Character, Character>() {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};
            Deque<Character> stack = new LinkedList<Character>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (pairs.containsKey(ch)) {
                    if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                        return false;
                    }
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
        }
    }
}
