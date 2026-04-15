import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;
        int op4 = a * b + c;

        System.out.println("a + b * c = " + op1);
        System.out.println("c + a / b = " + op2);
        System.out.println("a % b + c = " + op3);
        System.out.println("a * b + c = " + op4);

        int max = Math.max(Math.max(op1, op2), Math.max(op3, op4));
        int min = Math.min(Math.min(op1, op2), Math.min(op3, op4));

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}
