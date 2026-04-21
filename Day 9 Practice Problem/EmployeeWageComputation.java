import java.util.Random;

class EmployeeWageComputation {

    // Constants
    public static final int IS_PRESENT = 1;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    // Method for UC8 (multiple companies)
    public static void computeWage(String company, int wagePerHour,
                                   int maxDays, int maxHours) {

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        Random rand = new Random();

        while (totalHours < maxHours && totalDays < maxDays) {
            totalDays++;

            int empCheck = rand.nextInt(3); // 0,1,2

            int empHours = 0;

            // UC3 - Switch Case
            switch (empCheck) {
                case FULL_TIME:
                    empHours = 8;
                    break;

                case PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalHours += empHours;

            int dailyWage = empHours * wagePerHour; // UC2
            totalWage += dailyWage;

            System.out.println("Day " + totalDays +
                    " | Hours: " + empHours +
                    " | Daily Wage: " + dailyWage);
        }

        System.out.println("\nCompany: " + company);
        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Wage: " + totalWage);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8 - Multiple companies
        computeWage("TCS", 20, 20, 100);
        computeWage("Infosys", 25, 22, 120);
    }
}