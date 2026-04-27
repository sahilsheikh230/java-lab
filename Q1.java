import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0, max, min;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        max = min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
// Write a Java program to read n elements into a one-dimensional array and find the sum, average, maximum, and minimum values.