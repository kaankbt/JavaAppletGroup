package kaankubat.com.week1.Solution5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int length = kb.nextInt();

        int total = 0;

        for (int i = 1; i <= length; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
