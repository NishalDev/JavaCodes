package MissingNumber;

import java.util.Scanner;

public class MissingNumberArray {
    public static int missingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int actSum = 0;

        for (int num : arr) {
            actSum += num;
        }

        return (totalSum - actSum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing number is " + (missingNumber(arr, n)));
    }
}
