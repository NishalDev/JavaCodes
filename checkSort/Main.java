package checkSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkOrder(arr));
        sc.close();
    }

    public static boolean checkOrder(int[] arr) {
        for (int j = 0; j < (arr.length - 1); j++) {
            if (arr[j] > arr[j + 1]) {
                return false;
            }

        }
        return true;
    }
}