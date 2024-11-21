package medium;

public class Main3 {
    // Function to find a pair with the maximum product
    public static int[] findMaxProductPair(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int product1 = max1 * max2;
        int product2 = min1 * min2;

        if (product1 >= product2) {
            return new int[] { max1, max2 };
        } else {
            return new int[] { min1, min2 };
        }

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 4, 3, 6, 7, 0 };
        int[] arr2 = { -1, -3, -4, 2, 0, -5 };

        int[] result1 = findMaxProductPair(arr1);
        System.out.println("Pair with max product in arr1: {" + result1[0] + ", " + result1[1] + "}");

        int[] result2 = findMaxProductPair(arr2);
        System.out.println("Pair with max product in arr2: {" + result2[0] + ", " + result2[1] + "}");
    }
}
