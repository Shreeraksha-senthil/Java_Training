import java.util.*;
public class Max_count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        System.out.printf("Enter %d integer elements for the array:\n", size);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
//input:11
//1 2 5 6 8 9 9 3 4 2 2
//output:2