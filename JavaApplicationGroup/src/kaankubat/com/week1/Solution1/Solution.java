package kaankubat.com.week1.Solution1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.run();
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = kb.nextInt();

        System.out.print("Entered number: " + num);
    }
}

