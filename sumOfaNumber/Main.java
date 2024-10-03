package sumOfaNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkOrder(n));
        sc.close();
    }

    public static int checkOrder(int num) {
        int sum = 0;
        int n;
        while (num > 0) {
            n = num % 10;
            sum = sum + n;
            num = num / 10;

        }
        return sum;
    }
}