package kaankubat.com.week1.Solution4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.change();
    }

    public static void change() {
        Scanner kb = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#0.00");

        double keep = 0;
        double num1 = Math.random();
        double num2 = Math.random();

        System.out.println("--Before--");
        System.out.println("First number: " + numberFormat.format(num1));
        System.out.println("Second number: " + numberFormat.format(num2));

        keep = num1;
        num1 = num2;
        num2 = keep;

        System.out.println("--After--");
        System.out.println("Fist number: " + numberFormat.format(num1));
        System.out.println("Second number: " + numberFormat.format(num2));


    }
}


