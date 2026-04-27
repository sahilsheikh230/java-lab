import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLine();

        Arrays.sort(arr);

        System.out.println("Sorted:");
        for (String s : arr) System.out.println(s);

        String longest = arr[0];
        for (String s : arr)
            if (s.length() > longest.length())
                longest = s;

        System.out.println("Longest = " + longest);
    }
}
// Write a Java program to store multiple strings in an array and display them in alphabetical order, then find the longest string among them.