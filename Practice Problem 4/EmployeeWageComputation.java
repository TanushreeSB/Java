import java.util.Random;

public class EmployeeWageComputation {

    // Constants
    static final int IS_ABSENT = 0;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 8; // As per your requirement

    static final int WORKING_DAYS = 20;
    static final int MAX_HOURS = 100;

    public static void main(String[] args) {

        Random random = new Random();

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        // UC 5: Condition-based loop
        while (totalHours < MAX_HOURS && totalDays < WORKING_DAYS) {

            totalDays++;

            int empCheck = random.nextInt(3); // 0,1,2
            int empHours = 0;

            // UC 3: Switch Case
            switch (empCheck) {

                case IS_FULL_TIME:
                    empHours = FULL_TIME_HOURS;
                    System.out.println("Day " + totalDays + ": Full Time");
                    break;

                case IS_PART_TIME:
                    empHours = PART_TIME_HOURS;
                    System.out.println("Day " + totalDays + ": Part Time");
                    break;

                default:
                    empHours = 0;
                    System.out.println("Day " + totalDays + ": Absent");
            }

            // UC 2: Daily Wage
            int dailyWage = empHours * WAGE_PER_HOUR;
            System.out.println("Daily Wage: " + dailyWage);

            totalHours += empHours;
            totalWage += dailyWage;
        }

        // UC 4: Monthly Wage Output
        System.out.println("\nTotal Working Days: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Wage: " + totalWage);
    }
}
