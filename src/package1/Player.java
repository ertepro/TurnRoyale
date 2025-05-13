package package1;

public class Player {

    private Tower tower;
    private Field field;
    private Deck deck;
    private int mana = 10; // Max mana 10 ???
    private int manaRegen = 1; // it should change when special cards


    Player(Deck deck) {
        //we create the player with the deck
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public void upMana(){
        if(mana!=10){
            mana += manaRegen;
        }
        if(mana > 10){
            mana = 10;
        }
    }

    public void setMana(int manaRegen){
        this.manaRegen = manaRegen;
    }

    public Tower get_tower(){
        return tower;
    }

    public int getMana(){
        return mana;
    }

}
