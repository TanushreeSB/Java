import java.util.Random;

class GamblerSimulation {

    static final int STAKE = 100;
    static final int BET = 1;
    static final int DAYS = 20;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;

    public static void main(String[] args) {

        Random rand = new Random();

        int totalMoney = 0;
        int luckiestDay = 0, unluckiestDay = 0;
        int maxWin = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        int winDays = 0, lossDays = 0;

        for (int day = 1; day <= DAYS; day++) {

            int cash = STAKE;

            // UC2 & UC3: play until win/loss limit
            while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {
                if (rand.nextBoolean()) {
                    cash += BET; // win
                } else {
                    cash -= BET; // lose
                }
            }

            int net = cash - STAKE;
            totalMoney += net;

            // Track win/loss days
            if (net > 0) {
                winDays++;
            } else {
                lossDays++;
            }

            // Track luckiest & unluckiest day
            if (net > maxWin) {
                maxWin = net;
                luckiestDay = day;
            }

            if (net < maxLoss) {
                maxLoss = net;
                unluckiestDay = day;
            }

            System.out.println("Day " + day + ": " + (net >= 0 ? "+" : "") + net);
        }

        // UC4 output
        System.out.println("\nTotal after " + DAYS + " days: " + totalMoney);

        // UC5 output
        System.out.println("Winning days: " + winDays);
        System.out.println("Losing days: " + lossDays);

        System.out.println("Luckiest Day: Day " + luckiestDay + " (+" + maxWin + ")");
        System.out.println("Unluckiest Day: Day " + unluckiestDay + " (" + maxLoss + ")");
    }
}
