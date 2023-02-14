package com.dheeraj.dsaproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisChecker {

    /**

     Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
     For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

     Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

     Expected Time Complexity: O(|x|)
     Expected Auixilliary Space: O(|x|)

     Constraints:
     1 ≤ |x| ≤ 32000

     **/


    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> mapping = new HashMap<Character, Character>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (mapping.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    /**
     The function uses a stack to keep track of opening brackets.
     When it encounters a closing bracket,
     it checks whether the corresponding opening bracket is at the top of the stack.
     If not, it returns false. The function returns true if the stack is empty at the end of the loop.
     The time complexity of this solution is O(n),
     where n is the length of the input string,
     and the space complexity is also O(n),
     since the stack could potentially contain all the characters in the string.

     */
}
