import java.util.*;
public class Reverseofnum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = s.nextInt();
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }
}