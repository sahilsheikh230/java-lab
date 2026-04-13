import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

       
        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping (with third variable):");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}