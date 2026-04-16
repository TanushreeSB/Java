public class StaticDemo {
    static int count;

    // Static block
    static {
        count = 10;
        System.out.println("Static block executed. Count = " + count);
    }

    // Static method
    static void display() {
        System.out.println("Static method called. Count = " + count);
    }

    public static void main(String[] args) {
        display();
    }
}
