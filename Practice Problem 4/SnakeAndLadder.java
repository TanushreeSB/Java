import java.util.Random;

public class SnakeAndLadder {

    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        int player1Position = 0;
        int player2Position = 0;
        int diceCount = 0;

        Random rand = new Random();

        boolean isPlayer1Turn = true;

        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {

            int dice = rand.nextInt(6) + 1; // UC1: Dice 1-6
            int option = rand.nextInt(3);   // UC2: 0=No Play, 1=Ladder, 2=Snake
            diceCount++;

            if (isPlayer1Turn) {
                System.out.println("\nPlayer 1 rolls: " + dice);

                int newPosition = player1Position;

                switch (option) {
                    case 0:
                        System.out.println("No Play");
                        break;

                    case 1:
                        System.out.println("Ladder! Move ahead");
                        newPosition += dice;
                        break;

                    case 2:
                        System.out.println("Snake! Move back");
                        newPosition -= dice;
                        break;
                }

                // UC3: If below 0
                if (newPosition < 0) {
                    newPosition = 0;
                }

                // UC4: Exact 100 condition
                if (newPosition <= WINNING_POSITION) {
                    player1Position = newPosition;
                }

                System.out.println("Player 1 position: " + player1Position);

                // UC6: Ladder → play again
                if (option != 1) {
                    isPlayer1Turn = false;
                }

            } else {
                System.out.println("\nPlayer 2 rolls: " + dice);

                int newPosition = player2Position;

                switch (option) {
                    case 0:
                        System.out.println("No Play");
                        break;

                    case 1:
                        System.out.println("Ladder! Move ahead");
                        newPosition += dice;
                        break;

                    case 2:
                        System.out.println("Snake! Move back");
                        newPosition -= dice;
                        break;
                }

                if (newPosition < 0) {
                    newPosition = 0;
                }

                if (newPosition <= WINNING_POSITION) {
                    player2Position = newPosition;
                }

                System.out.println("Player 2 position: " + player2Position);

                if (option != 1) {
                    isPlayer1Turn = true;
                }
            }
        }

        // UC7: Winner
        if (player1Position == WINNING_POSITION) {
            System.out.println("\n🎉 Player 1 Wins!");
        } else {
            System.out.println("\n🎉 Player 2 Wins!");
        }

        // UC5: Dice count
        System.out.println("Total dice rolls: " + diceCount);
    }
}
