public class AirTroop implements TroopSender{
    @Override
    public Troop send(Troop troop){
        System.out.println("Sending Air Troop "+troop.name);
        troop.setAir();
        return troop;
    }
}
