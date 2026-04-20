import java.util.Scanner;

// Point class (OOP Concept)
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Line class implementing Comparable for UC3
class Line implements Comparable<Line> {

    Point p1, p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // UC 1: Calculate Length of Line
    public double getLength() {
        return Math.sqrt(
            Math.pow(p2.x - p1.x, 2) +
            Math.pow(p2.y - p1.y, 2)
        );
    }

    // UC 2: Equality check using equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line other = (Line) obj;

        return this.getLength() == other.getLength();
    }

    // UC 3: Compare two lines using compareTo()
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

// Main Class
public class LineComparisonComputation {

    public static void main(String[] args) {

        // Welcome message (Master branch requirement)
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch\n");

        Scanner sc = new Scanner(System.in);

        // Input for Line 1
        System.out.println("Enter Line 1 coordinates:");
        System.out.print("x1 y1: ");
        Point l1p1 = new Point(sc.nextInt(), sc.nextInt());

        System.out.print("x2 y2: ");
        Point l1p2 = new Point(sc.nextInt(), sc.nextInt());

        Line line1 = new Line(l1p1, l1p2);

        // Input for Line 2
        System.out.println("\nEnter Line 2 coordinates:");
        System.out.print("x1 y1: ");
        Point l2p1 = new Point(sc.nextInt(), sc.nextInt());

        System.out.print("x2 y2: ");
        Point l2p2 = new Point(sc.nextInt(), sc.nextInt());

        Line line2 = new Line(l2p1, l2p2);

        // UC 1: Length calculation
        System.out.println("\n--- LENGTH ---");
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 2 Length: " + line2.getLength());

        // UC 2: Equality check
        System.out.println("\n--- EQUALITY CHECK ---");
        if (line1.equals(line2)) {
            System.out.println("Both lines are EQUAL");
        } else {
            System.out.println("Lines are NOT equal");
        }

        // UC 3: Comparison
        System.out.println("\n--- COMPARISON ---");
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are EQUAL in length");
        } else if (result > 0) {
            System.out.println("Line 1 is GREATER than Line 2");
        } else {
            System.out.println("Line 1 is SMALLER than Line 2");
        }

        sc.close();
    }
}
