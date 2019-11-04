import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/trapping-rain-water/
 * @author LJY
 */
public class Trap {

    public int trap(int[] height) {
        if(height.length == 0){
            return 0;
        }
        int total = 0;
        List<Integer> heights = new ArrayList<>();
        for (int i : height) {
            heights.add(i);
        }
        for (int i = 0; i < heights.size(); i++) {
            //指针1
            int p1 = i;
            if(height[p1] == 0){
                continue;
            }
            for (int j = i; j < heights.size(); j++) {
                //指针2
                int p2 = j;
                if(height[p2] > height[p1] && p1 != p2 -1){
                    List<Integer> subList = heights.subList(p1 + 1, p2);
                    subList
                    continue;
                }

            }

        }

    }

}
