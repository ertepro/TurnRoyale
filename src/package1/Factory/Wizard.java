package package1.Factory;

public class Wizard extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Wizard";
        this.type = "Ground";
        this.mana_cost = 4;

        this.atk_spd = 1;
        this.a_df = 22;
        this.a_atk = 22;
        this.g_df = 2;
        this.g_atk = 4;
    }
}
