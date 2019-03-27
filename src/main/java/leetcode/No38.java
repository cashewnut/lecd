package leetcode;

import java.util.ArrayList;
import java.util.List;

public class No38 {


    public String countAndSay(int n) {
        String pre = "1";
        String say = "1";
        for (int i = 0; i < n - 1; i++) {
            say = say(pre);
            pre = say;
        }
        return say;
    }

    public String say(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;
            while (i < str.length() && str.charAt(i) == c) {
                i++;
                count++;
            }
            if(i < str.length() && str.charAt(i) != c)
                i--;
            sb.append(count).append(c);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No38().countAndSay(4));
    }

}
