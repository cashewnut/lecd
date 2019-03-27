package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class pdd2 {

    public static void main2(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String str = input.next().toLowerCase();
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            char c = 'z';
            for (int i = 0; i < str.length(); i = i + 2) {
                if (i == str.length() - 1) {
                    c = charArray[i];
                    break;
                }
                if (charArray[i] == charArray[i + 1]) {
                    charArray[i + 1] = 'z';
                    if (c == 'z')
                        c = charArray[i];
                } else {
                    c = charArray[i];
                    break;
                }
            }
            System.out.println(c);
        }

    }

    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.next().toLowerCase();
            int length = str.length();
            if (length == 1)
                System.out.println(str.toCharArray()[0]);
            char[] array = str.toCharArray();
            Arrays.sort(array);
            for (char c = 'a'; c <= 'z'; c++) {
                int count = 0;
                int i = 0;
                for (i = 0; i < length; i++) {
                    if (array[i] == c)
                        count++;
                    if (count == 2)
                        break;
                }
            }

        }
    }

    public static void remove(String str, int index) {
        if (index == 0)
            str = str.substring(1);
        else if (index == str.length() - 1)
            str = str.substring(0, str.length() - 1);

    }

}
