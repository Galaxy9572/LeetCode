package org.jy;

/**
 * 9、回文数
 * @author LJY
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else if(x == 0){
            return true;
        } else {
            StringBuilder sb = new StringBuilder(x + "");
            String numberStr = sb.toString();
            String reverseNumStr = sb.reverse().toString();
            return numberStr.equals(reverseNumStr);
        }

    }

}
