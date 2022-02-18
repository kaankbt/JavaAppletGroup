package kaankubat.com.week1.Solution7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.sumOfDigit();
    }

    public static void sumOfDigit() {
        Scanner kb = new Scanner(System.in);

        int counter = 0;

        System.out.println("Enter a number :");
        int num = kb.nextInt();

        while (num > 0) {
            num /= 10;
            counter++;
        }
        System.out.println("Sum of digit :" + counter);
    }
}
