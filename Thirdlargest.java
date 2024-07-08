import java.util.Scanner;
import java.util.Arrays;
public class Thirdlargest {
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
            Largest l = new Largest();
            l.third(arr);
        }
    }
    public static class Largest {
        void third(int arr[]) {
            Arrays.sort(arr);
            int n = arr.length;
            if (n < 3) {
                System.out.println("Array must have at least three elements.");
                return;
            }
            System.out.println("The third largest number is: " + arr[n - 3]);
        }
    }
}
