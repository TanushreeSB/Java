import java.util.*;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of flips: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        int heads = 0, tails = 0;

        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5)
                tails++;
            else
                heads++;
        }

        double headPercent = (heads * 100.0) / n;
        double tailPercent = (tails * 100.0) / n;

        System.out.println("Heads %: " + headPercent);
        System.out.println("Tails %: " + tailPercent);
    }
}
