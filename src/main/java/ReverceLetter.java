import java.util.Stack;

public class ReverceLetter {
    public static void main(String[] args) {
        ReverceLetter r = new ReverceLetter();
        System.out.println(r.Reverse("123#Maksim3!@kd"));

    }
    public String Reverse(String letter) {
        int len = letter.length();
        char[] chars = letter.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (Character.isLetter(chars[i])) {
                stack.push(chars[i]);
            }
        }
        for (int i = 0; i < len; i++) {
            if (Character.isLetter(chars[i])) {
                char symbol = stack.pop();
                chars[i] = symbol;
            }
        }
        String result = new String(chars);
        return result;
    }
}

