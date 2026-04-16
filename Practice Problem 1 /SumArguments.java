public class SumArguments {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Invalid Integers = " + invalidCount);
    }
}
