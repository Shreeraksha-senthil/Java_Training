import java.util.*;
public class Reverse {
    int reverseDigits(int num) {
        String numStr = String.valueOf(num);
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();
        int reversed = Integer.parseInt(reversedStr.toString());
        
        return reversed;
    }
    public static void main(String[] args) {
        Reverse rev = new Reverse();
        Scanner s=new Scanner(System.in);
        int input = s.nextInt();
        int output = rev.reverseDigits(input);
        System.out.println(output); 
    }
}