package kaankubat.com.week2.Solution1;

public class Solution {
    public static void main(String[] args) {
        Solution.listPrime();
    }

    public static void listPrime() {
        int control = 0;
        int count = 0;

        for (int i = 2; i <= 1000000; i++) {
            control = 0;

            for (int j = 2; j <= 1 / 2; j++) {
                if (i % j == 0) {
                    control++;
                    break;
                }
            }
            if (control == 0) {
                control++;
                System.out.println(i + "-");
            }
        }
    }
}


