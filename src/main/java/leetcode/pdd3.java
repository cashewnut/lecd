package leetcode;

import java.util.*;

public class pdd3 {

    static class Bank implements Comparable<Bank> {
        int l;
        int m;

        public Bank(int l, int m) {
            this.l = l;
            this.m = m;
        }


        @Override
        public int compareTo(Bank o) {
            return o.m - this.m;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt(), d = input.nextInt();
            List<Bank> banks = new ArrayList<>();
            for (int i = 0; i < n; i++)
                banks.add(new Bank(input.nextInt(), input.nextInt()));



            boolean flag = false;
            Collections.sort(banks);
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if(Math.abs(banks.get(i).l - banks.get(j).l) >= d){
                        System.out.println(banks.get(i).m + banks.get(j).m);
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
        }
    }

}
