/**
 * 7、数字反转
 * @author LJY
 */
public class NumberReverse {

    public int reverse(int x) {
        int result = 0;
        String reverseNumStr;
        if(x == 0){
            return x;
        }else if(x < 0){
            StringBuilder sb = new StringBuilder(-1 * x + "");
            reverseNumStr = "-" + sb.reverse().toString();
        }else{
            StringBuilder sb = new StringBuilder(x + "");
            reverseNumStr = sb.reverse().toString();
        }
        try {
            result = Integer.parseInt(reverseNumStr);
        } catch (NumberFormatException e) {
        }
        return result;
    }

}
