package kaankubat.com.week1.Solution6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.multiplicationTable();
    }

    public static void multiplicationTable() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = kb.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + i * num);
        }
    }
}
