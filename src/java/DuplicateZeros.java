package org.jy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int n = arr[i];
            if(n == 0){
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1,0,2,2,9,0,1};
//
//        new DuplicateZeros().duplicateZeros(arr);

        List<Integer> list1 = Arrays.asList(1,5,2,4,3);
        List<Character> list2 = Arrays.asList('A','B','C','D','E');
        int index = list1.indexOf(list1.stream().max(Integer::compareTo).get());
        System.out.println(list2.get(index));
    }

}
