package SortingAndReversingArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {6,4,2,1,2,3,45,5};
        // int n = arr.length;

        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = 0, i = 0;
        int start = 0;
        int end = n - 1;
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        // Arrays.sort(arr); // if you sorting and reversing
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        i =0;
        while (i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }
        sc.close();
    }
}