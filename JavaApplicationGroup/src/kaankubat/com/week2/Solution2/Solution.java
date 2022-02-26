package kaankubat.com.week2.Solution2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.listNum();
    }

    public static void listNum() {
        Scanner kb = new Scanner(System.in);
        System.out.print("N :");
        int length = kb.nextInt();

        for (int i = 1; i <= length; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + "-");
            }
        }
    }
}


