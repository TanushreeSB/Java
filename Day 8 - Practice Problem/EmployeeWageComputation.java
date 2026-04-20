import java.util.Random;

class EmployeeWageComputation {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    // UC 1: Attendance Check
    public static boolean isPresent() {
        Random random = new Random();
        return random.nextInt(2) == 1; // 0 = Absent, 1 = Present
    }

    // UC 2: Daily Wage
    public static int calculateDailyWage() {
        return WAGE_PER_HOUR * FULL_DAY_HOURS;
    }

    // UC 3: Part-time Wage
    public static int calculatePartTimeWage() {
        return WAGE_PER_HOUR * PART_TIME_HOURS;
    }

    // UC 4: Switch Case Wage Calculation
    public static int getWageByType(int type) {
        switch (type) {
            case 1:
                return calculateDailyWage();
            case 2:
                return calculatePartTimeWage();
            default:
                return 0;
        }
    }

    // UC 5: Monthly Wage (20 days)
    public static int calculateMonthlyWage() {
        int workingDays = 20;
        return calculateDailyWage() * workingDays;
    }

    // UC 6: Wage till 100 hours or 20 days
    public static int calculateWageTillLimit() {
        int maxHours = 100;
        int maxDays = 20;

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < maxHours && totalDays < maxDays) {
            totalDays++;
            totalHours += FULL_DAY_HOURS;
            totalWage += FULL_DAY_HOURS * WAGE_PER_HOUR;
        }

        return totalWage;
    }

    public static void main(String[] args) {

        // Welcome message (Master branch requirement)
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch\n");

        // UC 1
        boolean present = isPresent();

        if (present) {
            System.out.println("Employee is PRESENT\n");

            // UC 2
            System.out.println("Daily Wage: " + calculateDailyWage());

            // UC 3
            System.out.println("Part Time Wage: " + calculatePartTimeWage());

            // UC 4
            System.out.println("Switch Case (Daily Wage): " + getWageByType(1));
            System.out.println("Switch Case (Part Time Wage): " + getWageByType(2));

            // UC 5
            System.out.println("Monthly Wage (20 days): " + calculateMonthlyWage());

            // UC 6
            System.out.println("Wage till limit (100 hrs or 20 days): " + calculateWageTillLimit());

        } else {
            System.out.println("Employee is ABSENT");
        }
    }
}
