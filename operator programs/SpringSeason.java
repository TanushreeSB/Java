import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // month
        int d = sc.nextInt(); // day

        boolean isSpring = false;

        if ((m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20)) {
            isSpring = true;
        }

        System.out.println(isSpring);

        sc.close();
    }
}
