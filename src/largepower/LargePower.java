package largepower;

import java.util.Scanner;

public class LargePower {

    public static long largePowers(long a, long b, long c) {

        long output = a;
        long result = 1;

        while (b > 0) {

            if (b % 2 != 0) {

                output = output % c;
                result *= output;
                result = result % c;
            }

            output = output * output;
            output = output % c;
            b = b / 2;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();

        long output = largePowers(a, b, c);
        System.out.println(output);

    }

}
