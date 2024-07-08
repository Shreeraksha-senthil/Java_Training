import java.util.*;
public class Greatestofthree {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number1:");
        int a=s.nextInt();
        System.out.print("enter a number2:");
        int b=s.nextInt();
        System.out.print("enter a number3:");
        int c=s.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is greatest");
        }
        else if(b>=a && b>=c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
    }
}
