import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n){
        int index = 0;
        Stack<Character> stack = new Stack<>();
        while (index < n){
            char c = A.charAt(index);
            if (c == '('){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return  false;
                }
                stack.pop();
            }
            index++;
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
        }
    }
