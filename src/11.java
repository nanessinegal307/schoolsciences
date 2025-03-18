import java.util.*;
public class RandomCode {
    public static void main(String[] args) {
        int n = 5; // number of elements in the array
        int[] a = new int[n]; // array to store the elements
        for (int i = 0; i < n; i++) {
            Random rnd = new Random();
            int num = rnd.nextInt(10); // generate a random number between 0 and 9
            a[i] = num;
            System.out.println(num);
        }
    }
}