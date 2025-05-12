package package1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Troop> cards = new ArrayList<>();

    // Select the troops to the deck
    public void addCard(Troop troop) {
        cards.add(troop);
    }

    // Take one of the 3 first
    public Troop drawCard(int index) {
        if (index < 0 || index >= 3) { // 0 1 2
            throw new IllegalArgumentException("Invalid card index");
        }
        return cards.remove(index);
    }

    // Get the first 3 cards
    public List<Troop> getFirstThree() {
        if (cards.size() != 7) {
            throw new IllegalArgumentException("Error - there should be exactly 7 cards in the deck.");
        }
        return cards.subList(0, 3);
    }


    // Move the card to the bottom
    public void returnToBottom(Troop troop) {
        cards.add(troop);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
