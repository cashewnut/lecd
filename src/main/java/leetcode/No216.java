package leetcode;

import java.util.ArrayList;
import java.util.List;

public class No216 {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), n, k, 1);
        return list;

    }

    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int target, int k, int start) {
        if (tempList.size() > k || target < 0)
            return;
        if (tempList.size() == k) {
            if (target == 0)
                list.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < 10; i++) {
                tempList.add(i);
                backtrack(list, tempList, target - i, k, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new No216().combinationSum3(3,7));
    }

}
