package test;

import java.util.ArrayList;
import java.util.List;

public class A {

    public ArrayList<String> Permutation(String str) {
        List<List<Character>> res = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        backtrack(res,new ArrayList<>(),str.toCharArray());
        for(List<Character> chars : res){
            StringBuilder sb = new StringBuilder();
            for(Character c : chars){
                sb.append(c);
            }
            result.add(sb.toString());
        }
        return result;
    }

    public void backtrack(List<List<Character>> res,List<Character> tempList,char[] a){
        if(tempList.size()==3)
            res.add(new ArrayList<>(tempList));
        for(int i = 0;i<a.length;i++){
            if(tempList.contains(a[i]))
                continue;
            tempList.add(a[i]);
            backtrack(res,tempList,a);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new A().Permutation("abc"));
    }

}
