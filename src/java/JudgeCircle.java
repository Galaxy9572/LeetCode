/**
 * 657. 机器人能否返回原点
 *
 * @author LJY
 */
public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
        int[] pos = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    pos[1]++;
                    break;
                case 'D':
                    pos[1]--;
                    break;
                case 'L':
                    pos[0]--;
                    break;
                case 'R':
                    pos[0]++;
                    break;
                default:
                    break;
            }
        }
        return pos[0] == pos[1] && pos[1] == 0;
    }

}
