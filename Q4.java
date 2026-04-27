import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int[] merged = new int[n1 + n2];

        System.arraycopy(a, 0, merged, 0, n1);
        System.arraycopy(b, 0, merged, n1, n2);

        Arrays.sort(merged);

        for (int x : merged) System.out.print(x + " ");
    }
}
// Write a Java program to read two one-dimensional arrays and merge them into a single array, then display the merged array in sorted order.