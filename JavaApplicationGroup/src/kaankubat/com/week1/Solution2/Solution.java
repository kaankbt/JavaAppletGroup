package kaankubat.com.week1.Solution2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.add();
    }

    public static void add() {
        Scanner kb = new Scanner(System.in);

        int[] nums = new int[2];

        System.out.print("Numbers : ");
        nums[0] = kb.nextInt();
        nums[1] = kb.nextInt();

        int total = nums[0] + nums[1];
        System.out.print("Total : " + total);

    }
}

