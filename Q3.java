import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Found at position: " + i);
                found = true;
            }
        }

        if (!found) System.out.println("Not found");
    }
}
// Write a Java program to search for a given element in a one-dimensional array and display its position(s) if found.