package package1;

public enum TroopType {
    SKELETONS("Skeletons", "Ground", 2, 12, 0, 0, 2),
    ARCHERS("Archers", "Ground", 2, 15, 15, 1, 2),
    ARROWS("Arrows", "Air", 2, 15, 15, 0, 2),
    GIANT("Giant", "Ground", 5, 25, 0, 0, 5),
    MINI_PEKKA("Mini P.E.K.K.A", "Ground", 4, 35, 0, 0, 4),
    BABY_DRAGON("Baby Dragon", "Air", 4, 10, 20, 4, 4),
    MUSKETEER("Musketeer", "Ground", 3, 20, 20, 3, 3),
    PRINCE("Prince", "Ground", 5, 28, 0, 0, 5),
    BALLOON("Balloon", "Air", 6, 40, 0, 3, 6),
    BARBARIANS("Barbarians", "Ground", 3, 18, 0, 0, 3),
    GUARDS("Guards", "Ground", 3, 12, 0, 0, 3),
    GIANT_SKELETON("Giant Skeleton", "Ground", 6, 20, 0, 0, 6),
    WITCH("Witch", "Ground", 4, 15, 15, 2, 4),
    VALKYRIE("Valkyrie", "Ground", 3, 18, 0, 0, 3),
    WIZARD("Wizard", "Ground", 4, 22, 22, 2, 4),
    EXECUTIONER("Executioner", "Ground", 5, 20, 20, 5, 5),
    HUNTER("Hunter", "Ground", 4, 24, 8, 2, 4),
    ROYAL_GHOST("Royal Ghost", "Ground", 4, 30, 0, 0, 4),
    ENERGY_COLLECTOR("Energy Collector", "Special", 0, 0, 0, 0, 0),
    MANA_WIZARD("Mana Wizard", "Special", 0, 0, 0, 0, 0),
    STUN_GOLEM("Stun Golem", "Special", 0, 0, 0, 0, 0);

    private final String name;
    private final String type;
    private final int manaCost;
    private final int gDmg;
    private final int aDmg;
    private final int gDef;
    private final int aDef;

    TroopType(String name, String type, int manaCost, int gDmg, int aDmg, int gDef, int aDef) {
        this.name = name;
        this.type = type;
        this.manaCost = manaCost;
        this.gDmg = gDmg;
        this.aDmg = aDmg;
        this.gDef = gDef;
        this.aDef = aDef;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getManaCost() { return manaCost; }
    public int getGroundDamage() { return gDmg; }
    public int getAirDamage() { return aDmg; }
    public int getGroundDefense() { return gDef; }
    public int getAirDefense() { return aDef; }
}