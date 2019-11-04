/**
 * 461. 汉明距离
 *
 * @author LJY
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        if(x == y){
            return 0;
        }
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((mask & x) != (mask & y)) {
                count++;
            }
            mask <<= 1;
        }
        return count;
    }

}
