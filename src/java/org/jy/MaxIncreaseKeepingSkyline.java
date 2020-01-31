package org.jy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 807. 保持城市天际线
 * @author LJY
 */
public class MaxIncreaseKeepingSkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        Map<Integer,Integer> verticalMaxMap = new HashMap<>(grid.length);
        Map<Integer,Integer> horizontalMaxMap = new HashMap<>(grid.length);
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] horizontalArray = Arrays.copyOf(grid[i], grid.length);
            Arrays.sort(horizontalArray);
            horizontalMaxMap.put(i,horizontalArray[grid.length - 1]);
            int[] verticalArray = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                verticalArray[j] = grid[j][i];
            }
            Arrays.sort(verticalArray);
            verticalMaxMap.put(i,verticalArray[grid.length - 1]);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                Integer horizontal = horizontalMaxMap.get(i);
                Integer vertical = verticalMaxMap.get(j);
                Integer min = horizontal > vertical ? vertical : horizontal;
                count += (min - grid[i][j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MaxIncreaseKeepingSkyline().maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
    }

}
