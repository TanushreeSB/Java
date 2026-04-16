import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("Enter value between 0 and 30.");
            return;
        }

        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}
