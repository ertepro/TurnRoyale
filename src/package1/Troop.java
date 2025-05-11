package package1;

public abstract class Troop {
    private TroopType TroopType;

    public Troop(TroopType TroopType) {
        this.TroopType = TroopType;
    }

    public String getName() { return TroopType.getName(); }
    public String getType() { return TroopType.getType(); }
    public int getManaCost() { return TroopType.getManaCost(); }
    public int getGroundDamage() { return TroopType.getGroundDamage(); }
    public int getAirDamage() { return TroopType.getAirDamage(); }
    public int getGroundDefense() { return TroopType.getGroundDefense(); }
    public int getAirDefense() { return TroopType.getAirDefense(); }
}
