package package1;

import java.util.Scanner;

public class GameController {
    private final Player player1;
    private final Player player2;
    private int currentPlayer;
    // Troopfactory
    // Battle sys
    // Score manager
    private final Scanner scanner = new Scanner(System.in);
    public GameController() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.currentPlayer = 1;
    }

    public void runGame() {
        while (!isGameOver()) {



        }
    }

    private void startTurn() {
        // Add mana to current player based on mana reg
        // Check if consechits = 3 Call decorator
        // Call to open menu of 3 card selection
    }

    private void endTurn() {
        // Switch turn
    }

    // This function should be call after battle sys
    private boolean isGameOver() {
        // Call the observers to check if the tower is dead
        return false;
    }

    // Additional methods and logic here

    // START
    // add score
    // create players
    // add observer?
    // add factory
    // define turns


    // MAIN LOOP

    // menu for selecting each player's deck

    // -Mana manager-
    // Add mana to the players based on reg
    // Pay the mana after deploying the card

    // -Turns-
    // Switch turn
    // Show menu
    // Peek a card
    // Call play Card or not if it has no mana (skip turn)

    // -Battle sys-
    // resolve combat (TroopA,TroopB)

    // Observers to the towers
    // Update score




    // end turn


}
