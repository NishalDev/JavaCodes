package medium;

public class Main2 {
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n = n / 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 33;
        System.out.println("Binary of " + num1 + " is: " + decimalToBinary(num1));
        System.out.println("Binary of " + num2 + " is: " + decimalToBinary(num2));
    }
}
