package kaankubat.com.week2.Solution5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.tenNumsTotal();
    }

    public static void tenNumsTotal() {
        Scanner kb = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ".num: ");
            int num = kb.nextInt();
            total += num;
        }
        System.out.println("total :" + total);
    }
}
