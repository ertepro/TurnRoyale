public class Skeleto implements TroopSender{
    @Override
    public Troop send(Troop troop)
    {
        troop.name = "Skeleton";
        troop.setGround();
        troop.gDmg=12;
        troop.gDef=2;
        troop.atkSpeed=2;
        System.out.println("Sending "+troop.name);
        return troop;
    }
}
