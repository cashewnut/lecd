package leetcode;

import java.util.ArrayList;
import java.util.List;

public class No39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), target, candidates, 0);
        return list;

    }

    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int target, int[] candidates, int start) {
        if (target < 0)
            return;
        else if (target == 0)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(list, tempList, target - candidates[i], candidates, i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
