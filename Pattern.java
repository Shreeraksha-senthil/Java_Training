import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                   System.out.print("* "); 
                }
                else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}