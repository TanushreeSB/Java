import java.util.Random;

public class EmployeeWageComputation {

    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    static final int WORKING_DAYS = 20;
    static final int MAX_HOURS = 100;

    public static void main(String[] args) {

        Random random = new Random();

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        int totalSalary = 0;

        // UC 6: Loop until condition met
        while (totalEmpHours < MAX_HOURS && totalWorkingDays < WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = random.nextInt(3); // 0,1,2
            int empHours = 0;

            // UC 3: Switch Case
            switch (empCheck) {

                case IS_PRESENT:
                    empHours = FULL_DAY_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Full Time Employee");
                    break;

                case IS_PART_TIME:
                    empHours = PART_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Part Time Employee");
                    break;

                default:
                    empHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Absent");
            }

            // UC 1 & 2: Daily Wage
            int dailyWage = empHours * WAGE_PER_HOUR;
            System.out.println("Daily Wage: " + dailyWage);

            totalEmpHours += empHours;
            totalSalary += dailyWage;
        }

        // UC 4 & 5: Monthly Wage
        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Hours Worked: " + totalEmpHours);
        System.out.println("Total Salary: " + totalSalary);
    }
}
