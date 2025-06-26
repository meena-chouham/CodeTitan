import java.util.Stack;

public class q5 {
        public boolean isValid(String s) {
            Stack<Character> c = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(' || ch == '{' || ch == '[') {
                    c.push(ch);
                } else {
                    if (c.isEmpty())
                        return false;

                    char top = c.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
                        c.pop();
                    } else {
                        return false;
                    }
                }
            }

            return c.isEmpty();
        }
    

    public static void main(String[] args) {

    }
}
