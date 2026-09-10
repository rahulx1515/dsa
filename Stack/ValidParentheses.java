import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                stack.push(c);
            } else {
                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            } 
        }   
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        String s = "()[]{}";
        boolean ans = obj.isValid(s);
        System.out.println(ans);
    }
}

