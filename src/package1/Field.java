package package1;

import java.util.LinkedList;
import java.util.Queue;

public class Field {

    // Maybe it should have a max size

    // This contains the ones that are active when it moves it pulls the first
    // one and they fight
    private Queue<Troop> activeTroops = new LinkedList<>();

    // Add a troop to the end of the q
    public void addTroop(Troop troop) {
        activeTroops.add(troop);
    }

    // Get and remove the next troop to fight
    public Troop getNextFighter() {
        return activeTroops.poll();
    }

    // Gets the troop to fight it doesn't remove
    public Troop peekNextFighter() {
        return activeTroops.peek();
    }

    public boolean isEmpty() {
        return activeTroops.isEmpty();
    }

    public int size() {
        return activeTroops.size();
    }
}

