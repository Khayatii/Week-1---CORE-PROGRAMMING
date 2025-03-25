import java.util.Scanner;

public class CardGame {

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute n cards to x players
    public static String[][] distributeCards(String[] deck, int totalCards, int numPlayers) {
        if (totalCards % numPlayers != 0) {
            System.out.println("Cannot distribute " + totalCards + " cards evenly to " + numPlayers + " players.");
            return null;
        }

        int cardsPerPlayer = totalCards / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print each player's cards
    public static void printPlayers(String[][] players) {
        if (players == null)
            return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter number of cards to distribute: ");
        int totalCards = scanner.nextInt();

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute cards and print
        String[][] players = distributeCards(deck, totalCards, numPlayers);
        printPlayers(players);

        scanner.close();
    }
}