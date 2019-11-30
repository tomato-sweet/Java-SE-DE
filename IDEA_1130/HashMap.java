import java.util.Stack;

//1、左括号入栈
//2、如果遇到左括号，获取栈顶元素，判断栈顶元素是否和右括号匹配，如果匹配，继续遍历剩余的字符，如果不匹配，直接返回false
//3、判断栈是否为空，如果为空，返回true，不为空，返回false
class HashMap{
    private HashMap<Character, Character> mappings;
    public Solution(){
        this.mappings = new HashMap<Character,Character>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }
    public boolean isValid(String  s){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(this.mappings)
        }
    }
}