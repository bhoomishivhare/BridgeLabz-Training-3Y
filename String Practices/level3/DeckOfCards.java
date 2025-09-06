import java.util.Arrays;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int n) {
        if (players * n > deck.length) return null;
        String[][] result = new String[players][n];
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = deck[i * n + j];
            }
        }
        return result;
    }

    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(playersCards[i]));
        }
    }

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        int players = 4, n = 5; // example: 4 players, 5 cards each
        String[][] playersCards = distributeCards(deck, players, n);
        printPlayersCards(playersCards);
    }
}
