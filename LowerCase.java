import java.util.Stack;

public class LowerCase {
    public static String toLowerCase(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i)  <= 90) {
                char ch = (char) (str.charAt(i) + 32);
                stack.push(ch);
                continue;
            } 
            stack.push(str.charAt(i));
        }
        stack = reverse(stack);
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
    public static <T extends Comparable<? super T>> Stack<T> reverse(Stack<T> stacky) {
        Stack<T> temp = new Stack<>();
        while(!stacky.isEmpty()) {
            temp.push(stacky.pop());
        }
        return temp;
    }
    public static void main(String[] args) {
        String hString = "Hello";
        System.out.println(toLowerCaseChad(hString));

    }
}
