public class Util {

    // 1. Day of Week
    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    // 2. Temperature Conversion
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // 3. Monthly Payment
    public static double monthlyPayment(double P, double Y, double R) {
        double n = 12 * Y;
        double r = R / (12 * 100);
        return (P * r) / (1 - Math.pow(1 + r, -n));
    }

    // 4. Square Root (Newton's Method)
    public static double sqrt(double c) {
        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c/t) > epsilon * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    // 5. Binary Conversion
    public static String toBinary(int n) {
        String bin = Integer.toBinaryString(n);
        return String.format("%32s", bin).replace(' ', '0');
    }
}
