/**
 * 14、最长公共前缀
 * @author LJY
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String... strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int shortestLength = strs[0].length();
        int index = 0;
        StringBuilder commonStrBuilder = new StringBuilder(shortestLength);
        for (int i = 0; i < strs.length; i++) {
            int charsLength = strs[i].length();
            if (charsLength < shortestLength) {
                shortestLength = charsLength;
                index = i;
            }
        }
        String shortestStr = strs[index];
        for (int i = 0; i < shortestLength; i++) {
            char c = shortestStr.charAt(i);
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if(j == index){
                    continue;
                }
                if(strs[j].charAt(i) != c && i == 0){
                    return "";
                }
                if ((strs[j].charAt(i) != c)) {
                    flag = false;
                }
            }
            if (flag) {
                commonStrBuilder.append(c);
            }
        }
        return commonStrBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix("aca","cba"));
    }

}
