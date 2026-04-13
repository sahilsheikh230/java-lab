import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        
        double sum = num1 + num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
        double remainder = num1 % num2;


        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}





















































