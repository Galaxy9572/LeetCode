import java.util.Stack;

/**
 * @author LJY
 */
public class ReverseString {

    public String reverseString(String s) {
        if(s == null || "".equals(s)){
            return s;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = chars.length - 1; i >= 0; i--) {
            stack.push(chars[i]);
        }
        StringBuilder stringBuilder = new StringBuilder(chars.length);
        stack.forEach(e -> stringBuilder.append(e.charValue()));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = new ReverseString().reverseString("A man, a plan, a canal: Panama");
        System.out.println(s.equals("amanaP :lanac a ,nalp a ,nam A"));
    }

}
