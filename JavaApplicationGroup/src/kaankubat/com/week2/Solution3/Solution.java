package kaankubat.com.week2.Solution3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution.listAlphabetic();
    }

    public static void listAlphabetic() {
        Scanner sc = new Scanner(System.in);
        int n;   //Declare the array size
        System.out.println("Enter the number of elements ");
        n = sc.nextInt();

        String fruits[] = new String[n];
        System.out.println("Enter the String ");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            fruits[i] = sc1.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (fruits[i].compareTo(fruits[j]) > 0) {
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(fruits));
    }
}


