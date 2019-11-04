import java.util.*;

/**
 * 914. 卡牌分组
 *
 * @author LJY
 */
public class HasGroupsSizeX {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(deck).forEach(i -> {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
        });
        List<Integer> counts = new ArrayList<>(map.values());
        for (int i = 0; i < counts.size() - 1; i++) {
            for (int j = i + 1; j < counts.size(); j++) {
                int v1 = counts.get(i);
                int v2 = counts.get(j);
                while (true) {
                    int temp = v1 % v2;
                    if (temp == 0) {
                        break;
                    } else {
                        v1 = v2;
                        v2 = temp;
                    }
                }
                if (v2 == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new HasGroupsSizeX().hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }

}
