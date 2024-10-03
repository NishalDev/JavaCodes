package fibonacci;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Fibonacci of %d is %d", n, fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return (fibonacci(n - 1) + (fibonacci(n - 2)));
    }
}
