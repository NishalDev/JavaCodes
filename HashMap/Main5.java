package HashMap;
import java.util.Scanner;
import java.util.HashMap;
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to compress:");
        String compString = scanner.nextLine();
        
        int result = countNonRepeatedCharacters(compString);
        System.out.println(result);

        scanner.close();
    }

    public static int countNonRepeatedCharacters(String string){
        if(string.isEmpty() || string == null){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c: string.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        int nonRepeatedChar = 0;
        for(int count: map.values()){
            if(count == 1){
                nonRepeatedChar++;
            }
        }
        return nonRepeatedChar;
    }
}
