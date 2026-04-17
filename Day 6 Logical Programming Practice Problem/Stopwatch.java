public class Stopwatch {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        Thread.sleep(2000); // simulate work

        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (end - start) + " ms");
    }
}
