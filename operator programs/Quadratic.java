import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Both roots are equal");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Roots are imaginary");
        }

        sc.close();
    }
}
