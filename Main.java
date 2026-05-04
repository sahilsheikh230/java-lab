import java.util.Scanner;

class Cal {
    int result;

    int add(int n1, int n2) {
        result = n1 + n2;
        System.out.println("Sum is: " + result);
        return result;
    }

    int subtract(int n1, int n2) {
        result = n1 - n2;
        System.out.println("Difference is: " + result);
        return result;
    }

    int multiply(int n1, int n2) {
        result = n1 * n2;
        System.out.println("Product is: " + result);
        return result;
    }

    boolean divide(int n1, int n2) {
        if (n2 == 0) {
            return false;
        } else {
            double result = (double) n1 / n2;
            System.out.println("Division result is: " + result);
            return true;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        history={}
        Cal obj = new Cal();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
             int res=   obj.add(a, b);
                history.addition=res
                break;


            case 2:
                obj.subtract(a, b);
                break;

            case 3:
                obj.multiply(a, b);
                break;

            case 4:
                boolean res = obj.divide(a, b);
                if (!res) {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
        System.out.println(history)
    }
}