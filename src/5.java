import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize an array with integers from 1 to 10
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Print the array elements using a for-each loop
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}