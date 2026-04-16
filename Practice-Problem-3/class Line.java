public class Line implements Comparable<Line> {

    private int x1, y1, x2, y2;

    // Constructor
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // UC 1: Calculate Length
    public double getLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // UC 2: Check Equality using equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    // UC 3: Compare using compareTo()
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }

    // Display
    public void display() {
        System.out.println("Line Length: " + getLength());
    }

    public static void main(String[] args) {

        Line line1 = new Line(0, 0, 3, 4); // length = 5
        Line line2 = new Line(1, 1, 4, 5); // length = 5

        line1.display();
        line2.display();

        // UC 2: Equality Check
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }

        // UC 3: Comparison
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Lines are equal.");
        } else if (result > 0) {
            System.out.println("Line1 is greater than Line2.");
        } else {
            System.out.println("Line1 is less than Line2.");
        }
    }
}
