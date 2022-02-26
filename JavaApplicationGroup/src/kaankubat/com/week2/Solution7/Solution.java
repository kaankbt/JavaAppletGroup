package kaankubat.com.week2.Solution7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = kb.nextLine();

        int length = text.length();

        for (int i = 1; i <= length; i++) {
            System.out.println(text);
        }
    }
}
