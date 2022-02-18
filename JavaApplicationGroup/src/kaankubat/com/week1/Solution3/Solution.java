package kaankubat.com.week1.Solution3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.multiplication();
    }

    public static void multiplication() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a first number (double) : ");
        double num1 = kb.nextDouble();
        System.out.print("Enter a second number (double) : ");
        double num2 = kb.nextDouble();

        double total = num1 * num2;

        System.out.print("Multiplication result : " + total);
    }
}
