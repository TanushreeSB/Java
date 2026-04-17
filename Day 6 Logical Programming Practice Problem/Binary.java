public class Binary {

    public static int swapNibbles(int x) {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 100;

        int swapped = swapNibbles(num);
        System.out.println("After swapping nibbles: " + swapped);

        if (isPowerOfTwo(swapped))
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");
    }
}
