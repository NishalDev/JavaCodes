package fibonacci;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("Fibonacci of %d is %d", n, fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int temp = 0;
        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        for (int i = 2; i < n; i++) {

            temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;

        }
        return (fib2);
    }
}
