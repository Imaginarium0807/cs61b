
// Java code for stack implementation

import java.io.*;
import java.util.*;

public class lc_20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (mappings.containsKey(ch)) {
                stack.push(ch);
            }
            else if (stack.isEmpty() || mappings.get(stack.pop()) != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String x = "{[[}]]";
        System.out.println(isValid(x));

    }
}