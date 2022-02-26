package kaankubat.com.week2.Solution6;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution.oddEven();
    }

    public static void oddEven() {
        Scanner kb = new Scanner(System.in);

        int num, odd = 0, even = 0;
        Random rnd = new Random();

        for (int i = 1; i <= 10; i++) {
            num = rnd.nextInt(1, 100);
            System.out.println(num);
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd nums -> " + odd);
        System.out.println("even nums -> " + even);


    }
}
