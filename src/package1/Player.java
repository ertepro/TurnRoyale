package package1;

public class Player {

    Player(Deck deck) {
        //we create the player with the deck
        this.deck = deck;
    }

    private Tower tower;
    private Field field;
    private Deck deck;
    private int mana = 0; // Max mana 10 ???
    private int manaRegen = 1; // it should change when special cards

}
