package medium;

public class Main1 {
    public static int findTotalSum(int n, int[] arr, int position) {
    
        int sum = 0;
        for(int i = n-1; i >= position;i--){
            sum = sum + Math.abs(arr[i] - arr[i-1]);
            
        }
        return sum; 
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {11, 22, 12, 24, 13, 26, 14};
        int position = 5;
        int result = findTotalSum(n, arr, position);
        System.out.println("Total Sum of Absolute Differences: " + result);
    }
}
