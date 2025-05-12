package package1;

public class TroopFactory {
    public Troop createTroop(TroopType type) {
        return new BasicTroop(type);
    }

    // Basic troop
    private static class BasicTroop extends Troop {
        public BasicTroop(TroopType type) {
            super(type);
        }

        // Inherits all getters from abstract Troop class
        // No special abilities yet
        // IDK how would be done
    }
}