import java.util.HashMap;
import java.util.Stack;

public class Text02 {
    public static void main(String[] args) {
        boolean valid = new Text02().isValid("(){{}[]}({})");
        System.out.println(valid);
    }
    public boolean isValid(String s) {

        char[] chars = s.toCharArray();
        if (chars.length%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='('||chars[i]=='{'||chars[i]=='['){
                stack.push(chars[i]);
                continue;
            }
            if (chars[i]==')'){
                if (stack.empty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '(') {
                    return false;
                }
            }
            if (chars[i]=='}'){
                if (stack.empty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '{') {
                    return false;
                }
            }
            if (chars[i]==']'){
                if (stack.empty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '[') {
                    return false;
                }
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
