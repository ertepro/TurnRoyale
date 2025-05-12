package package1;

public abstract class Troop {
    private TroopType TroopType;
    private int currentaDef;
    private int currentgDef;
    private int currentaDmg;
    private int currentgDmg;

    public Troop(TroopType TroopType) {
        this.TroopType = TroopType;
    }

    public String getName() { return TroopType.getName(); }
    public String getType() { return TroopType.getType(); }
    public int getManaCost() { return TroopType.getManaCost(); }

    // This for menu printing
    public int getGroundDamage() { return TroopType.getGroundDamage(); }
    public int getAirDamage() { return TroopType.getAirDamage(); }
    public int getGroundDefense() { return TroopType.getGroundDefense(); }
    public int getAirDefense() { return TroopType.getAirDefense(); }

    // This for attacks
    // Make them inicialiced
    public int getCurrGroundDamage() { return currentgDmg; }
    public int getCurrAirDamage() { return currentaDmg; }
    public int getCurrGroundDefense() { return currentgDef; }
    public int getCurrAirDefense() { return currentaDef; }
}
