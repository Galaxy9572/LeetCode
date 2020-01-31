package org.jy;

/**
 * 709. 转换成小写字母
 * @author LJY
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
        if(str == null || str.length() == 0){
            return str;
        }
        char[] chars = str.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }

}
