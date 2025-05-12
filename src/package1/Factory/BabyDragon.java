package package1.Factory;

public class BabyDragon extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Baby Dragon";
        this.type = "Air";
        this.mana_cost = 4;

        this.atk_spd = 2;
        this.a_df = 20;
        this.a_atk = 20;
        this.g_df = 4;
        this.g_atk = 4;
    }
}
