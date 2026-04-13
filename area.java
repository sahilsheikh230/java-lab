import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter the LANGTH AND BREADTH of the RECTANGLE: ");
        double L = sc.nextDouble();
        double B = sc.nextDouble();

        double perimeter = 2 * 3.14 * r;
        double area = 3.14 * r * r;
double recper=2*(L+B);
double arearec=L*B;

        System.out.println("Perimeter of circle: " + perimeter);
        System.out.println("Area of circle: " + area);
         System.out.println("Perimeter of rectangle: " + recper);
        System.out.println("Area of rectangle: " + arearec);

    }
}