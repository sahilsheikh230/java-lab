import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) digits++;
            else if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            } else special++;
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }
}
// Write a Java program to read a string and count the number of vowels, consonants, digits, and special characters.