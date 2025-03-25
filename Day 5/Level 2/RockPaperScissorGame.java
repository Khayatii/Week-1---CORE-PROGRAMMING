import java.util.Scanner;

public class RockPaperScissorGame {

    // Method to generate random computer choice
    public static String getComputerChoice() {
        double random = Math.random(); // random number between 0.0 to 1.0
        if (random < 0.33)
            return "rock";
        else if (random < 0.66)
            return "paper";
        else
            return "scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "draw";

        if (user.equals("rock")) {
            return computer.equals("scissors") ? "user" : "computer";
        } else if (user.equals("paper")) {
            return computer.equals("rock") ? "user" : "computer";
        } else if (user.equals("scissors")) {
            return computer.equals("paper") ? "user" : "computer";
        } else {
            return "invalid";
        }
    }

    // Method to calculate stats
    public static String[][] calculateStats(int totalGames, int userWins, int computerWins) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames) + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                    (i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\n----- Final Stats -----");
        System.out.println("Player\tWins\tWin Percentage");
        System.out.println("------------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your move (rock/paper/scissors): ");
            String userMove = scanner.nextLine().toLowerCase();

            String computerMove = getComputerChoice();
            String winner = findWinner(userMove, computerMove);

            if (winner.equals("user"))
                userWins++;
            else if (winner.equals("computer"))
                computerWins++;

            gameResults[i][0] = userMove;
            gameResults[i][1] = computerMove;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(totalGames, userWins, computerWins);
        displayResults(gameResults, stats);
    }
}