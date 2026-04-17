import java.util.HashSet;
import java.util.Random;

public class CouponNumbers {
    public static void main(String[] args) {
        int n = 5;
        HashSet<Integer> set = new HashSet<>();
        Random rand = new Random();
        int count = 0;

        while (set.size() < n) {
            int num = rand.nextInt(100);
            count++;
            set.add(num);
        }

        System.out.println("Total random numbers needed: " + count);
    }
}
