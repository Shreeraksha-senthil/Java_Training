import java.util.*;
public class GreatestofTwo {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number1:");
        int a=s.nextInt();
        System.out.print("enter a number2:");
        int b=s.nextInt();
        if(a>b){
            System.out.println("A is greatest");
        }
        else{
            System.out.println("B is greatest");
        }
    }
}
