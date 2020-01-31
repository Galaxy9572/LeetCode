package org.jy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20、有效的括号
 * @author LJY
 */
public class IsBracketsValid {

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        } else if (s.length() == 0) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>(3);
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.empty()){
                    return false;
                }
                Character pop = stack.pop();
                if (map.get(pop) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(new IsBracketsValid().isValid("){"));
        System.out.println(new IsBracketsValid().isValid("()[]{}"));
        System.out.println(new IsBracketsValid().isValid("({[()]})"));
        System.out.println(new IsBracketsValid().isValid("(]"));
        System.out.println(new IsBracketsValid().isValid("([)]"));
    }

}
